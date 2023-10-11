package ie.atu.lab3library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    private LibraryService ls;

    @Autowired
    public void setMyLibrary(LibraryService ls){
        this.ls=ls;
    }

    @PostMapping("addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public void newBook(@RequestBody Book book){
        ls.addBook(book);
        System.out.println(ls.getBooks());
        System.out.println();
    }
}
