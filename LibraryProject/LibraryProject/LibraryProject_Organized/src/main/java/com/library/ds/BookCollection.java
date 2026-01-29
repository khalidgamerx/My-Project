package com.library.ds;

import com.library.model.Book;

/** Common operations used by all book collections in this project. */
public interface BookCollection {
    void add(Book book);
    void display();
}
