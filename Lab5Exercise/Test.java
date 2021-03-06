
/**
 * This Test class was written to provide examples of how to use Java API class library on 
 * the class String.
 * 
 * @author Kevin Talbot 
 * @version 09-06-15
 */
public class Test
{
    // instance variables - replace the example below with your own
    private String text;
    private int l;

    /**
     * Constructor for objects of class Test
     */
    public Test(String txt)
    {
        // initialise instance variables
        text = txt;
        l = text.length();
        System.out.println(test2());
    }

    public String getText()
    {
        return text;
    }

    public void setText(String s)
    {
        text = s;
    }
    
    public void test(String input)
    {        

        System.out.println(text.startsWith(input));
        
        System.out.println(text.endsWith(input));
        
        System.out.println(l);
    }
    
    public String test2()
    {
        String result;
        result = text.trim();
        return result;
        
    }
    
    public boolean compareStrings(String a)
    {
        return text.equals(a);
    }
    
    
    
}
