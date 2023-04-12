package OneToOne;


import OneToManyBi.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController1 {

    @Autowired
    AuthorRepo1 authorRepo1;


    @GetMapping("/author/onetoone")
     public void set() {
        Author1 author1 = new Author1();
        Book1 book1 = new Book1();
        book1.setBookName("Maths");
        book1.setAuthor1(author1);

        Author1 author2 = new Author1();
        Book1 book2 = new Book1();
        book1.setBookName("Science");
        book1.setAuthor1(author2);


        author1.setBooks(book1);

        authorRepo1.save(author1);
    }


}
