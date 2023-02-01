package com.jpa.associations.service;

import com.jpa.associations.entity.many_to_many.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findByBookTitle(String title, String isbn);
}
