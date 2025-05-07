package com.springboot_libreria.springboot_libreria.model;

import java.io.Serializable;
import jakarta.persistence.*;

@Embeddable
public class BookAuthorId implements Serializable {
    private Long bookId;
    private Long authorId;

    public BookAuthorId() {}
    public BookAuthorId(Long bookId, Long authorId) {
        this.bookId = bookId;
        this.authorId = authorId;
    }

    // equals() and hashCode()  



}
