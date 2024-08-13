package lambda.example;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBookInserted(){
       List<Book> books =  new BookDAO().getBook();
        Collections.sort(books, new MyBookComparator());
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookInserted());

    }
}
class MyBookComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

