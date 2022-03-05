import java.util.Scanner;
/**
 * This is a simulation of a 
 * fortune teller genie named Foebe.
 * This is the driver class.
 * 
 * @Meeksha Tyagi
 * @03/12/2020
 */
public class FortuneDriver
{
    public static void main(String[] args)
    {
        //Declare Scanner called input to give
        //user the option to rerun program
        Scanner input = new Scanner(System.in);
        
        //Declare empty String "ans" to store answer
        String ans = "";
        
        //Does the first iteration of do-while loop
        //and then asks if the user wants to run the
        //fortune teller simulation again
        do
        {
            //Creates a new instance of class FortuneReader
            FortuneReader newFR = new FortuneReader();
            
            //Creates a new instance of class FortuneTeller
            FortuneTeller newFT = new FortuneTeller(); 
            
            //Calls the readInput() method using newFR to read
            //in birth month and name of the user and stores
            //it in class variables   
            newFR.readInput();
            
            //Calls the fillFortunes() method using newFR to 
            //read in fortunes from a file and store in an array
            newFR.fillFortunes();
            
            //TESTMETHOD
            //newFR.testVariables(newFR.getFortunes(),
            // newFR.getName(),newFR.getMonth());
            
            //Calls the showFortune() method using newFT
            //The getters: newFR.getFortunes(), newFR.getName(), 
            //newFR.getMonth() are passed in to showFortune()
            //as arguments because these methods return 
            //String arrays of fortunes, user's names,
            //and birth months respectively. 
            //showFortune() prints the fortune of the user
            //after checking conditionals and switch statements
            //and randomnly displays a fortune from the array.
            newFT.showFortune(newFR.getFortunes(), newFR.getName()
            , newFR.getMonth());
            
            //Blank line between content
            System.out.println();
            
            //Prompts user to run program again.
            System.out.print("Run again?(y/n) ");
            
            //Stores the answer of the user in "ans"
            ans = input.next();
            
            //Blank line between content
            System.out.println();
        }
        //This loop while contine while ans stores 'y' or
        //'Y'
        while(ans.equalsIgnoreCase("y"));
    }
}
