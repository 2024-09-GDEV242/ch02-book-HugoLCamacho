/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Hugo Camacho
 * @version 09/17/2024
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numOfPages, boolean isTextbook)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numOfPages;
        refNumber = "";
        borrowed = 0;
        courseText = isTextbook;
    }
    /***
     * returns the auther of the book
     */
    public String printAuther(){
    return author;
    
    }
    /***
     * returns the title of the book
     */
    public String printTitle(){
    return title;
    
    }
    
    /***
     * Returns the number of pages of the book
     */
    public int getPages(){
    
    return pages;
    
    }
    
    /***
     * Returns details about the book. if there is no ref number, it will display ZZZ as the ref number
     */
    public String printDetails(){
    
        if (refNumber.length() == 0){
    
    return String.format(
    "Title: %s, Author: %s, Number of pages: %d,Reference number: ZZZ, This book was borrowed %d times"
    ,author, title, pages, borrowed);} 
    
    else {
      return String.format(
      "Title: %s, Author: %s, Number of pages: %d, Reference number: %s, This book was borrowed %d times"
      ,author, title, pages, refNumber, borrowed);}
    }
    
    /***
     * Sets the reference number for the book. The number has to be atleast 3 characters long
     */
    public void setRefNumber(String refNum){
       
        if(refNum.length() < 3){
        
            System.out.println("The refernce number needs to be at least 3 characters");
        
        } else {
    refNumber = refNum;}
    }
    
    /***
     *  Returns the referance number of the book
     */
    public String getRefNumber(){
    
    return refNumber;
    
    }
    
    
    /***
     * Method that adds to a running total each time the book is borrowed
     */
    public void borrow(){
    
    borrowed += 1;
    }
    
    /***
     * Returns the amount of times that a book gets borrowed
     */
    public int getBorrowed(){
    return borrowed;
    }
    
    /***
     * Returns a boolean that tells if a book is a textbook for a course or not
     */
    public boolean isCourseText(){
    
    
    return courseText;
    }

    // Add the methods here ...
}
