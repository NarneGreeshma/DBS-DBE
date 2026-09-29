package com.library.library_api.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String title;

    @Column(nullable = false, unique = true, length = 13)
    private String isbn;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "published_date", nullable = false)
    private LocalDate publishedDate;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Lob
    @Column(name = "embedding", columnDefinition = "LONGTEXT")
    private String embedding;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt = OffsetDateTime.now();

    // No-argument constructor
    public Book() {
    }

    // ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String v) {
        title = v;
    }

    // ISBN
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String v) {
        isbn = v;
    }

    // Price
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal v) {
        price = v;
    }

    // Published Date
    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate v) {
        publishedDate = v;
    }

    // Description
    public String getDescription() {
        return description;
    }

    public void setDescription(String v) {
        description = v;
    }

    // Embedding
    public String getEmbedding() {
        return embedding;
    }

    public void setEmbedding(String v) {
        embedding = v;
    }

    // Created By
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long v) {
        createdBy = v;
    }

    // Created At
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime v) {
        createdAt = v;
    }
}