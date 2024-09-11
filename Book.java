/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @authorHugo Camacho
 * @version 09/10/2024
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
    
    public String printAuther(){
    return author;
    
    }
    
    public String printTitle(){
    return title;
    
    }
    
    public int getPages(){
    
    return pages;
    
    }
    
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
    
    public void setRefNumber(String refNum){
       
        if(refNum.length() < 3){
        
            System.out.println("The refernce number needs to be at least 3 characters");
        
        } else {
    refNumber = refNum;}
    }
    
    public String getRefNumber(){
    
    return refNumber;
    
    }
    
    public void borrow(){
    
    borrowed += 1;
    }
    
    public int getBorrowed(){
    return borrowed;
    }
    
    public boolean isCourseText(){
    
    
    return courseText;
    }

    // Add the methods here ...
}
