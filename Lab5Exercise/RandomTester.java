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
       
            
       // NOTE: this example method above could have been completed by creating an array of answers
   }
   
   public String getResponse2()
   {
       // the correct succingt solution to this method from Dr Ron Grau
       // since we do not manipulate the responses.size in any way we can insert this directly as
       // the input for responses.get()
       // *remembering of course that if there are 3 items in our array that the maximum answer 
       // from the index is 3. This being stored as index value 0, 1, 2.
       return responses.get(number.nextInt(responses.size()));
       
       
       // create a random number that represent the index in the list ofpossible responses
       // int index = number.nextInt(responses.size()-1);
       // return responses.get(index);
       
   }
}
