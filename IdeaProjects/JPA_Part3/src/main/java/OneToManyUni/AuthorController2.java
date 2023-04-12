package OneToManyUni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AuthorController2 {

    @Autowired
    AuthorRepo2 authorRepo2;

    @GetMapping("/author/oneToManyUni")
    public void add(){
        Author2 author2=new Author2();
        Book2 b1=new Book2();
        b1.setBookName("English");

        Book2 b2=new Book2();
        b1.setBookName("Maths");

        Book2 b3=new Book2();
        b1.setBookName("Science");

        author2.setBooks(List.of(b1,b2,b3));
        authorRepo2.save(author2);


    }
}
