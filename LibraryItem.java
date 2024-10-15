public class LibraryItem
{
    private String title;
    private int yearPublished;

    public LibraryItem(String title, int yearPublished){
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public void getDetails()
    {
        System.out.println("title: " + title);
        System.out.println("year published: " + yearPublished);
    }
}
class Book extends LibraryItem
{
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn, int yearPublished)
    {
        super(title, yearPublished);
        this.author = author;
        this.isbn = isbn;
    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
    }
}

class Magazine extends LibraryItem {
    String publisher;
    int issueNumber;

    public Magazine(String title, String publisher, int issueNumber, int yearPublished) {
        super(title, yearPublished);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("publisher: " + publisher);
        System.out.println("issue number: " + issueNumber);
    }
}