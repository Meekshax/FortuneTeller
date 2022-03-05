import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *This class reads input from user and
 *stores it in class variables month and name.
 *It reads a file using scanner and counts the lines 
 *of fortunes in it and accordingly fills the array 
 *(Class variable fortunes) of fortunes.
 *
 * @Meeksha Tyagi
 * @03/10/2020
 */
public class FortuneReader
{
    //I declare a string array that will store fortunes
    //from the Fortunes.txt file
    private String[] fortunes;

    //I declare a month variable so that
    //later I can store the users birth month
    private int month;

    //I declare a string variable name that will
    //store the users name
    private String name;

    /**
     * this method will read in the month and name of
     * the user and store them in the private instance
     * variables
     */
    public void readInput()
    {
        //I initialize a scanner to get user input
        Scanner scn = new Scanner(System.in);

        //Intro text that gives introduction to the fortune
        //teller simulation and asks the user to enter their
        //birth month number
        System.out.print("Welcome to the Fortune Teller! " + 
            "Hello, earthling. I'm Foebe, The Fortune Teller!" + 
            "\n\nLet's begin:\n" +
            "\nTell me your birth month number: ");

        //Users input is stored into month
        this.month = scn.nextInt();

        //Asks the user to enter their name
        System.out.print("What do you like to be called? ");

        //Stores the users name in a variable name
        this.name = scn.next();             
    }

    /**
     * Reads the file and counts the number of lines 
     * in the text file so that later it can serve as
     * the arrays length
     */
    public int fileLineCount()
    {
        //Initialize the line count at 0
        int lineNum = 0;

        //Declare a scanner to read from file
        Scanner fileReader = null;
        try
        {
            //File name is Fortunes.txt
            fileReader = new Scanner(new File("Fortunes.txt"));
        }
        catch(FileNotFoundException e)
        {
            //If no such file, throw this exception
            System.out.println("File not found.");
        }

        //Once the file is found, count the number
        //of lines in the file
        while(fileReader.hasNextLine())
        {
            //In order to move to the next line
            fileReader.nextLine();

            //increments by one every a new line
            //is read 
            lineNum++;
        }

        //Returns the number of lines
        return lineNum;
    }

    /**
     * Reads the file and fills every element
     * in the array "fortunes" with a line (of fortune)
     * from the text
     */
    public String[] fillFortunes()
    {
        //the length of the array is set using the 
        //fileLineCount() method
        this.fortunes = new String[fileLineCount()];

        //Declare a scanner to read from file
        Scanner fileReader = null;
        try
        {
            //File name is Fortunes.txt
            fileReader = new Scanner(new File("Fortunes.txt"));
        }
        catch(FileNotFoundException e)
        {
            //If no such file, throw this exception
            System.out.println("File not found.");
        }

        //This loops through the array and fills every
        //element with a line of fortune from the text file
        for(int i = 0; i < this.fortunes.length; i++)
        {
            this.fortunes[i] = fileReader.nextLine();
            //System.out.println(this.fortunes[i]);
        }

        //Returns array of fortunes
        return this.fortunes;
    }

    /**
     * Returns a clean copy of the array 
     * filled with fortunes
     */
    public String[] getFortunes()
    {
        //new clean copy of array of Strings
        //"fortunes" to return and use in driver
        String[] copyOfFortunes =
            new String[this.fortunes.length];

        //This loops and creates identical array to 
        //the orgininal "fortunes"
        for(int i = 0; i < this.fortunes.length; i++)
        {
            copyOfFortunes[i] = this.fortunes[i];
            //System.out.println(copyOfFortunes[i]);
        }

        //This returns copy of "fortunes" array 
        return copyOfFortunes;
    }

    /**
     * Returns the birth month of the user
     */
    public int getMonth()
    {
        return this.month;
    }

    /**
     * Returns the preferred name of the user
     */
    public String getName()
    {
        //Returns  of the user
        return this.name;
    }

    /**
     * Setter included in case manual input is required
     */
    public void setMonth(int newMonth)
    {
        this.month = newMonth;
    }

    /**
     * Setter included in case manual input is required
     */
    public void setName(String newName)
    {
        this.name = newName;
    }

    /**
     * This method tests the Array of fortunes and displays
     * the content of each element. It also displays the 
     * birth month of the user and the name.
     */
    public void testVariables(String[] passedFortunes, String passedName, int passedMonth)
    {
        System.out.println("To verify the information from the file was read"+
            " in correctly, here is a list of the fortunes: ");
        for(int i = 0; i < passedFortunes.length; i++)
        {
            System.out.println("Fortune#" + (i+1) + ": " + passedFortunes[i]);
        }
        System.out.println();
        System.out.println("This birth month should match with month entered by" +
            " the user: " + passedMonth);
        System.out.println("This name should correspond with the name entered" +
            "by the user: " + passedName);       
    }
}
