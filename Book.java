import java.util.HashSet;
import java.util.Set;

public class Book {
    private int bookcode;
    private String bookname;
    private String bookauthor;
    private int bookrate;
    
    private static Set<Book> availablebooks = new HashSet<>();
    static
    {
        // System.out.println("Book Data Loaded");
        availablebooks.add(new Book(1,"Clean Code","Robert C. Martin",300));
        availablebooks.add(new Book(2,"The Pragmatic Programmer","Andrew Hunt and David Thomas",430));
        availablebooks.add(new Book(3,"Code Complete","Steve McConnell",450));
        availablebooks.add(new Book(4,"Refactoring","Kent Back",540));
        
    }
    Book(){};
    Book(int bookcode,String bookname,String bookauthor,int bookrate){
        this.bookcode = bookcode;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
        this.bookrate = bookrate;

    }
    public int getBookCode(){
        return this.bookcode;
    }
    public int getBookPrice(){
        return this.bookrate;
    }
    public String getBookName(){
        return this.bookname;
    }
    public String getBookDetail(){
        return "Code: "+this.bookcode+"\nName: "+this.bookname+"\nAuthor: "+this.bookauthor+"\nRate: "+this.bookrate+" rupees\n";
    }
    public static Set<Book> getAllAvailableBooks() {
        return availablebooks;
    }
    public static Book searchBookInRepo(String searchbook){
        for(Book b : availablebooks){
            if(b.bookname.toLowerCase().equals(searchbook.toLowerCase()))
                return b;
        }
        return null;
    }
    
}
