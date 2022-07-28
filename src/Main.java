import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", 550, "Ali", "2020");

        Book b2 = new Book("Masal", 650, "Ahmet", "2010");

        Book b3 = new Book("Ýnci", 250, "Ayþe", "2000");

        Book b4 = new Book("Rüzgar", 320, "Mustafa", "1999");

        Book b5 = new Book("Ay da hayat", 140, "Nedim", "1990");



        TreeSet<Book>  booksetPageNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });

        booksetPageNum.add(b1);
        booksetPageNum.add(b2);
        booksetPageNum.add(b3);
        booksetPageNum.add(b4);
        booksetPageNum.add(b5);

        for(Book bookPage: booksetPageNum){
            System.out.println(bookPage.getBookName() + " : " + bookPage.getPageNumber());
        }


    }
}
