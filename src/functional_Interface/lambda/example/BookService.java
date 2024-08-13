package functional_Interface.lambda.example;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getBookInserted(){
       List<Book> books =  new BookDAO().getBook();
       //lambda expression
        Collections.sort(books, (o1,o2)-> o1.getName().compareTo(o2.getName()
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
        ));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookInserted());

    }
}
/*class MyBookComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}*/

