import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Menu_Generator_Main
{
    public static void main(String[] arg) throws FileNotFoundException
    {
        String language = "";
        int menuOptions;

        //Menu Block
        System.out.println("Select Language:");
        System.out.println("1. Java");
        System.out.println("2. C++ (Coming soon...)");
        System.out.println("3. Python");
        System.out.println("4. Quit");

        //User Input
        System.out.println("Please choose an option 1-3:");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        System.out.println("Option " + Integer.toString(option) + " has been selected...");

        switch(option) {
            case 1:
            {
                language = "Java";
                break;
            }
            case 2:
            {
                language = "CPP";
                break;
            }
            case 3:
            {
                language = "Python";
                break;
            }
            case 4:
            {
                return;
            }
        } //End Switch
        
        //Select # of menu options
        System.out.println("How many menu options would you like?");
        menuOptions = input.nextInt();
        System.out.println("You have selected " + Integer.toString(menuOptions) + " options...");
        System.out.println("\n\n\n");
        System.out.println("Submitting parameters...");

        if(language == "Java") {
            Java_Menu newMenu = new Java_Menu(menuOptions);
            newMenu.menuPrint();
        }
    } //End of Main
} //End of Class