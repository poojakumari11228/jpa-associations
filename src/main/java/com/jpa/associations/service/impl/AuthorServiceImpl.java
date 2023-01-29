package com.jpa.associations.service.impl;

import com.jpa.associations.entity.many_to_many.Author;
import com.jpa.associations.repo.AuthorRepo;
import com.jpa.associations.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepo authorRepo;
    @Override
    public List<Author> findByBookTitle(String title) {
        return authorRepo.findByBooksTitle(title);
    }
}
