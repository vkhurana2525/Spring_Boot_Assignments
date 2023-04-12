package OneToOne;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="authorOneToOne")
public class Author1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "author1",cascade = CascadeType.ALL)
    private Book1 book1;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book1 getBooks() {
        return book1;
    }

    public void setBooks(Book1 book1) {
        this.book1=book1;
    }
}
