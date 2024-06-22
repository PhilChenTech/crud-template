package com.eastrabbit.crudtemplate.book.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
}
