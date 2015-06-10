import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Names here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Names
{
    // instance variables - replace the example below with your own
    private String[] namesArray;
    private ArrayList<String> namesArrayList;
    
    /**
     * Constructor for objects of class Names
     */
    public Names()
    {
        namesArray = new String[3];//initialize here the namesArray to a String array with 3 elements
        namesArrayList = new ArrayList<String>();// initialize here the namesArrayList
    }
    
    public void initArray()
    {
        namesArray[0] = "Marco";
        namesArray[1] = "Joe";
        namesArray[2] = "Matt";
        // initialize here the namesArray to "Marco", "Joe", "Matt"
    }
    
    public void initArrayList()
    {
        namesArrayList.add("Marco");
        namesArrayList.add("Joe");
        namesArrayList.add("Matt");
        
        // initialize here the namesArrayList to "Marco", "Joe", "Matt"
    }
    
    public void printArray()
    {
        for(int i=0;i < namesArray.length;i++)
        {
            System.out.println(namesArray[i]);
        }
        
        int i = 0;
        while( i < namesArray.length) {
            System.out.println(namesArray[i]);
            i++;
        }
    }
    
    public void printArrayList()
    {
        for(String name : namesArrayList) {
                System.out.println(name);
        }
        
        for(int i=0;i < namesArrayList.size();i++)
        {
            System.out.println(namesArrayList.get(i));
        }
        
        int i = 0;
        while( i < namesArrayList.size()) {
            System.out.println(namesArrayList.get(i));
            i++;
        }
        
        Iterator<String> it = namesArrayList.iterator();
        while( it.hasNext() )
        {
            System.out.println( it.next() );
        }
    }
}
