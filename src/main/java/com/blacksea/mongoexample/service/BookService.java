package com.blacksea.mongoexample.service;

import com.blacksea.mongoexample.domain.BooksEntity;

import java.util.List;

public interface BookService {
    List<BooksEntity> getAll();
    BooksEntity getById(String id);
    BooksEntity getByName(String bookName);
    BooksEntity save(BooksEntity booksEntity);
}
