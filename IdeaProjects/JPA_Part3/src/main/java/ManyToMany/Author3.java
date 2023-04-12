package ManyToMany;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="author_mtm")
public class Author3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="joinTable",joinColumns = @JoinColumn(name="authorId",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name="bookId",referencedColumnName = "bId"))
    private List<Book3> book;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Book3> getBook() {
        return book;
    }

    public void setBook(List<Book3> book) {
        this.book = book;
    }
}
