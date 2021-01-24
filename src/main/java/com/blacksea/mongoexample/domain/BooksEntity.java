package com.blacksea.mongoexample.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Document(collection = "books")
public class BooksEntity {
    @Id
    private String id;
    private String bookName;
    private String bookDescription;
}
