/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }

    /**
     * This accessor (getter) method returns the value of the author variable
     */
    public String getAuthor()
    {
        return author;
    }
    
    /**
     * this accessor (getter) method returns the value of the title variable
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * This accessor (getter) method returns the value sof the number of pages in the book
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * This accessor (getter) method returns the refNumber - primarily in this task I am 
     * setting it to test whether the setRefNumber() works
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /**
     * This is an accessor (getter) method to return the value of variable borrowed
     */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    /**
     * This is the mutator (setter) method to set the variable of the refNumber
     * in order to help a library record book information.
     */
    public void setRefNumber(String refNumber)
    {
        if(refNumber.length() < 3)
        {
            System.out.println("Reference number must be at least 3 characters long");
        } else {
            this.refNumber = refNumber;
        }
    }
    
    /**
     * This ia mutator (setter) method to increase the number of variable borrowed each time 
     * it is called
     */
    public void setBorrowed()
    {
        // borrowed += borrowed;
        // I think this can also be typed as
        // borrowed++;
        // or
        borrowed = borrowed +1;
    }
    
    
    /**
     * This method prints the author name to the terminal
     */
    public void printAuthor()
    {
        System.out.println(this.author);
    }
    
    /**
     * This method prints the book title to the terminal
     */
    public void printTitle()
    {
        System.out.println(this.title);
    }
    
    /**
     * This method prints the number of pages held in the book
     */
    public void printPages()
    {
        System.out.println(this.pages);
    }
    
    /**
     * this method prints the details of the author, title and pages to the terminal
     */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("No. of pages: " + pages);
                
        if(refNumber.length()<1) {
            System.out.println("There is no reference number for this item");
        } else {
            System.out.println("Reference Number: " + refNumber);
        }
        System.out.println("Borrowed (no. of times): " + borrowed);
    }
}