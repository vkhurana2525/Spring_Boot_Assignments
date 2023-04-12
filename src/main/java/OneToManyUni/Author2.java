package OneToManyUni;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="author_otm_uni")
public class Author2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "authorId")
    private List<Book2> books;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Book2> getBooks() {
        return books;
    }

    public void setBooks(List<Book2> books) {
        this.books = books;
    }
}
