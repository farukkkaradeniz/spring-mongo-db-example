package com.blacksea.mongoexample.repository;

import com.blacksea.mongoexample.domain.BooksEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BooksRepository extends MongoRepository<BooksEntity,String> {
    Optional<BooksEntity> findByBookName(String name);
}
