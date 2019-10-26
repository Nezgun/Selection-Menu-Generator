import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Menu_Generator_Main
{
    public static void main(String[] arg) throws FileNotFoundException
    {
        int menuOptions;
        
        //Select # of menu options
        System.out.println("How many menu options would you like?");
        Scanner input = new Scanner(System.in);
        menuOptions = input.nextInt();
        System.out.println("You have selected " + Integer.toString(menuOptions) + " options...");
        System.out.println("\n\n\n");
        System.out.println("Submitting parameters...");

        Java_Menu newMenu = new Java_Menu(menuOptions);
        newMenu.menuPrint();
    } //End of Main
} //End of Class