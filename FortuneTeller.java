import java.util.Random;
/**
 * FortuneTeller displays the fortune.
 *
 * @Meeksha Tyagi
 * @version (a version number or a date)
 */
public class FortuneTeller
{
    /**
     * This method prints the fortune of the user to
     * the console. It accepts a String array, a String
     * and an integer as an argument. 
     * Depending on the info provided by the user,
     * it goes through conditions to generate the user's
     * fortune.
     */
    public void showFortune(String[] fortunes, String name, 
    int month)
    {
        //If the length of the user's preferred name is 
        //greater than 8, it executes this block of code
        if(name.length() > 8)
        {
            System.out.print("\nWhat a regal name you have, " + name + "!");
        }
        else if(name.length() <= 8 && name.length() > 3)
        //Else if the length of the user's preferred name is 
        //less than or equal to 8, aswell as greater than 3
        //it executes this block of code
        {
            System.out.print("\n" + name + ", your name rings true to your essence!");
        }
        else if(name.length() <= 3 && name.length() > 0)
        //Else if the length of the user's preferred name is 
        //less than or equal to 3, as well as greater than 0
        //it executes this block of code
        {
            System.out.print("\nI sense that you have a strong personality, " + name);
        }
        else
        //Default situation
        {
            System.out.print("\nYour name continues to be a mystery");
        }

        //Blank line for space between content
        System.out.println("\n");
        
        //Switch statement used as the birth months
        //are numerically specific and this was a 
        //more efficicient way to display the user's
        //characteristic depending on birth month
        switch(month)
        {
            case 1: 
            System.out.print("You are on a quest for power");
            break;
            
            case 2: 
            System.out.print("You are on a quest for stability");
            break;
            
            case 3: 
            System.out.print("You are on a quest for knowledge");
            break;
            
            case 4: 
            System.out.print("You are on a quest for emotional maturity");
            break;
            
            case 5: 
            System.out.print("You are on a quest for your own personal values");
            break;
            
            case 6: 
            System.out.print("You are on a quest for perfection");
            break;
            
            case 7: 
            System.out.print("You are on a quest for beauty");
            break;
            
            case 8: 
            System.out.print("You are on a quest for happiness");
            break;
            
            case 9: 
            System.out.print("You are on a quest for experience");
            break;
            
            case 10: 
            System.out.print("You are on a quest for self-love");
            break;
            
            case 11: 
            System.out.print("You are on a quest for acceptance");
            break;
            
            case 12: 
            System.out.print("You are on a quest for peace of mind");
            break;
            
            default:
            System.out.print("You are lost on this quest called life");
            break;
        }
        
        //Blank line between content
        System.out.println("\n");

        //Declare and initializes a random
        Random r = new Random();
        //Uses the random to randomly pick a fortune out
        //of the array of fortunes
        int fortuneNumber = r.nextInt(fortunes.length);
        //Prints out the fortune after randomly selecting it
        System.out.println(fortunes[fortuneNumber]);

    }
}
