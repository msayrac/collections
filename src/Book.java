import java.util.Comparator;

public class Book implements Comparable<Book> {

    private String bookName;
    private int pageNumber;
    private String bookAuthorName;
    private String bookPublicationYear;
    private int o1;
    private int o2;


    public Book(String bookName, int pageNumber, String bookAuthorName, String bookPublicationYear) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.bookAuthorName = bookAuthorName;
        this.bookPublicationYear = bookPublicationYear;
    }



    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(String bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    @Override
    public int compareTo(Book o) {
        return o1-o2;
    }
}
