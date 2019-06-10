public class Java_Menu
{
    //internal variables
    int options;
    String menu;

    //constructor
    /**
     * 
    **/
    public Java_Menu(int numOfOptions)
    {
        this.options = numOfOptions;
        menuInit();
        addOptions();
        addUserInput();
        switchSetup();
        closeOut();
    }

    public String retrieveMenu()
    {
        return menu;
    }

    public void menuPrint()
    {
        System.out.print(menu);
    }

    private void menuInit()
    {
        menu = "boolean running = true;\n\n"; //run condition
        menu += "while(running) {\n";
    }

    private void addOptions()
    {
        for(int i = 0; i < options; i++)
        {
            menu += ("\tSystem.out.println(\"Option " + (i+1) + ": <your option here>\");\n");
        }
        menu += ("\tSystem.out.println(\"Option " + (options + 1) + ": Quit\");\n\n");
    }

    private void addUserInput()
    {
        menu += "\t//User Input\n";
        menu += "\tSystem.out.println(\"Please choose an option 1-" + (options + 1) + "\");\n";
        menu += "\tScanner input = new Scanner(System.in);\n";
        menu += "\tint option = input.nextInt();\n";
        menu += "\tSystem.out.println(\"Option \" + Integer.toString(option) + \" has been selected...\");\n\n";
    }

    private void switchSetup()
    {
        menu += "\tswitch(option); {\n";
        for(int i = 0; i < options; i++)
        {
            menu += ("\t\tcase " + (i+1) + ":\n");
            menu += "\t{\n";
            menu += "\t\t//Your code here\n";
            menu += "\t\tbreak;\n";
            menu += "\t}\n";
        }
        menu += ("\t\tcase " + (options+1) + ":\n");
        menu += "\t{\n";
        menu += "\t\trunning = false;\n";
        menu += "\t\tbreak;\n";
        menu += "\t}\n";
    }

    private void closeOut()
    {
        menu += "\t} //End Switch\n";
        menu += "} //End While";
    }

} //end class

/*
how to do this?

boolen running = true;

while(running) {
    System.out.println("Option x: <your option here>");
    System.out.println("Option y: Quit");

    //User Input
    System.out.println("Please choose an option 1-7"); 
    Scanner input = new Scanner(System.in);
    int option = input.nextInt();
    System.out.println("Option " + Integer.toString(option) + " has been selected...");

    switch(option) {
        case x:
        {
            //Insert your code here
            break;
        }
        case y:
        {
            running = false;
            break;
        }
*/