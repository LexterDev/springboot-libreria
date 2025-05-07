package com.springboot_libreria.springboot_libreria.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Embeddable
public class SaleDetailId implements Serializable {
    private Long saleId;
    private Long bookId;

    public SaleDetailId() {}
    public SaleDetailId(Long saleId, Long bookId) {
        this.saleId = saleId;
        this.bookId = bookId;
    }

    // equals() and hashCode()
}
