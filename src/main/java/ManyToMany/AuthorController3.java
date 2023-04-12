package ManyToMany;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController3 {

    @Autowired
    AuthorRepo3 authorRepo3;

    @GetMapping("/authors/mtm")
    public void add(){
        Author3 a1=new Author3();
        Author3 a2=new Author3();
        Author3 a3=new Author3();

        Book3 b1=new Book3();
        b1.setBookName("English");
        b1.setAuthors(List.of(a1,a2));

        Book3 b2=new Book3();
        b2.setBookName("Maths");
        b2.setAuthors(List.of(a2,a3));

        Book3 b3=new Book3();
        b3.setBookName("Science");

        a1.setBook(List.of(b1,b2));
        a2.setBook(List.of(b2,b3));

        authorRepo3.save(a1);
        authorRepo3.save(a2);
        authorRepo3.save(a3);

    }
}
