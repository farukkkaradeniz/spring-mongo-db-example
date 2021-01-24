package com.blacksea.mongoexample.service.impl;

import com.blacksea.mongoexample.domain.BooksEntity;
import com.blacksea.mongoexample.repository.BooksRepository;
import com.blacksea.mongoexample.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BooksRepository booksRepository;

    public BookServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public List<BooksEntity> getAll() {
        return booksRepository.findAll();
    }

    @Override
    public BooksEntity getById(String id) {
        return booksRepository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found with id : " + id));
    }

    @Override
    public BooksEntity getByName(String bookName) {
        return booksRepository.findByBookName(bookName).orElseThrow(() -> new RuntimeException("Entity not found with name : " + bookName));
    }

    @Override
    public BooksEntity save(BooksEntity booksEntity) {
        return booksRepository.save(booksEntity);
    }
}
