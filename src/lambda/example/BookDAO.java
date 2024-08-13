package lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBook(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(101,"siva",123));
        books.add(new Book(102,"bala",456));
        books.add(new Book(103,"sam",789));
        books.add(new Book(104,"virat",1000));
        books.add(new Book(105,"vishal",300));
        books.add(new Book(106,"david",250));
        return books;
    }
}
