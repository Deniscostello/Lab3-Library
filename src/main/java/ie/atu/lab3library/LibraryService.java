package ie.atu.lab3library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class LibraryService {
    private ArrayList <Book> books =new ArrayList<>();

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }



}
