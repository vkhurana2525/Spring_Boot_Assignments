package OneToManyBi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    AuthorRepo authorRepo;

    @GetMapping("/author/otm_bi")
    public void addAuthor() {
        Address address = new Address();
        address.setStreetNumber(5);
        address.setLocation("Vaishnavi");
        address.setState("Delhi");

        Author author1 = new Author();
        author1.setAddress(address);

        Book book1 = new Book();
        book1.setBookName("English");
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setBookName("Hindi");
        book2.setAuthor(author1);

        Book book3 = new Book();
        book3.setBookName("Maths");
        book3.setAuthor(author1);

        author1.setBooks(List.of(book1, book2, book3));
        authorRepo.save(author1);
    }
}
