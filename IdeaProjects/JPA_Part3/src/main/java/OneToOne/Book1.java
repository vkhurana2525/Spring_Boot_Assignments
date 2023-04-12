package OneToOne;


import jakarta.persistence.*;

@Entity
public class Book1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="author1_id",referencedColumnName="id")
    Author1 author1;

    private String bookName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author1 getAuthor1() {
        return author1;
    }

    public void setAuthor1(Author1 author1) {
        this.author1 = author1;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
