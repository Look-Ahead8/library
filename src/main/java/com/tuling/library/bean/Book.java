package com.tuling.library.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private Integer bookId;

    private String bookName;

    private String bookAuthor;

    private String bookGist;

    private Date bookPubDate;

    private Date bookProDate;

    private BigDecimal bookProPrice;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGist() {
        return bookGist;
    }

    public void setBookGist(String bookGist) {
        this.bookGist = bookGist;
    }

    public Date getBookPubDate() {
        return bookPubDate;
    }

    public void setBookPubDate(Date bookPubDate) {
        this.bookPubDate = bookPubDate;
    }

    public Date getBookProDate() {
        return bookProDate;
    }

    public void setBookProDate(Date bookProDate) {
        this.bookProDate = bookProDate;
    }

    public BigDecimal getBookProPrice() {
        return bookProPrice;
    }

    public void setBookProPrice(BigDecimal bookProPrice) {
        this.bookProPrice = bookProPrice;
    }
}