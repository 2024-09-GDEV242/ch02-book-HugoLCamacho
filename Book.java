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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    public String printAuther(){
    return author;
    
    }
    
    public String printTitle(){
    return title;
    
    }

    // Add the methods here ...
}
