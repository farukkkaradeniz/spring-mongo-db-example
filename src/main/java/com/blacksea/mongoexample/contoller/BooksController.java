package com.blacksea.mongoexample.contoller;

import com.blacksea.mongoexample.domain.BooksEntity;
import com.blacksea.mongoexample.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BooksEntity>> getAll() {
        return ResponseEntity.ok(this.bookService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BooksEntity> getById(@PathVariable String id) {
        return ResponseEntity.ok(this.bookService.getById(id));
    }

    @GetMapping("/by-name/{bookName}")
    public ResponseEntity<BooksEntity> getByBookName(@PathVariable String bookName) {
        return ResponseEntity.ok(this.bookService.getByName(bookName));
    }

    @PostMapping
    public ResponseEntity<BooksEntity> save(@RequestBody BooksEntity booksEntity) {
        return ResponseEntity.ok(this.bookService.save(booksEntity));
    }
}
