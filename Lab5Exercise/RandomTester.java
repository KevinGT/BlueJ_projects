import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class randomTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random number;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class randomTest
     */
    public RandomTester()
    {
        // initialise instance variables
        number = new Random();
        responses = new ArrayList<String>();
        responses.add("Yes");
        responses.add("No");
        
    }

    public void printOneRandom()
    {
        System.out.println(number.nextInt());
    }
    
    public void printMultiRandom(int rNumbers)
    {
        for(int i=1;i <= rNumbers;i++)
        {
            printOneRandom();
        }
    }
    
   public void throwDice()
   {
       int diceRoll = number.nextInt(7);
       if(diceRoll > 0) 
       {
           System.out.println(diceRoll);
       } else {
           throwDice();
       }
   }
    
   public void getResponse()
   {
       int choice = number.nextInt(3);
       
       if(choice == 0)
       {
           System.out.println("Yes");
        } 
        else if(choice == 1)
        {
            System.out.println("No");
         } 
         else {
             System.out.println("Maybe");
            }
       
   }
   
   public String getResponse2()
   {
       
       // create a random number that represent the index in the list ofpossible responses
       int index = number.nextInt(responses.size()-1);
       return responses.get(index);
       
   }
}
