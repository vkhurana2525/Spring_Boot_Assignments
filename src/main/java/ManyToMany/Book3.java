package ManyToMany;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="book_mtm")
public class Book3 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bId;
    private String bookName;

    @ManyToMany(mappedBy = "book")
    List<Author3> authors;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public List<Author3> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author3> authors) {
        this.authors = authors;
    }
}
