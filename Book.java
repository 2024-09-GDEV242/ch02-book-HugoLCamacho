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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numOfPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numOfPages;
        refNumber = "";
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
    
    return String.format("Title: %s, Author: %s, Number of pages: %d, Reference number: ZZZ",author, title, pages);} 
    
    else {
      return String.format("Title: %s, Author: %s, Number of pages: %d, Reference number: %s",author, title, pages, refNumber);}
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

    // Add the methods here ...
}
