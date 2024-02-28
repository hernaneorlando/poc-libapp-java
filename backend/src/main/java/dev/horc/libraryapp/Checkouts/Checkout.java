package dev.horc.libraryapp.Checkouts;

import dev.horc.libraryapp.Books.Book;
import dev.horc.libraryapp.Gateway.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "checkouts")
public class Checkout extends BaseEntity {

    @Column(nullable = false)
    private String userId;

    @ManyToOne()
    private Book book;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
