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

    /**
     * Set the author and title fields when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
     * This is the mutator (setter) method to set the variable of the refNumber
     * in order to help a library record book information.
     */
    public void setRefNumber(String refNumber)
    {
        this.refNumber = refNumber;
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
    }
}