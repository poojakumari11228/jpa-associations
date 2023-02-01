package com.jpa.associations.controller;

import com.jpa.associations.entity.Course;
import com.jpa.associations.entity.many_to_many.Author;
import com.jpa.associations.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/author")
public class AuthortController {

    private final AuthorService authorService;

    @Autowired
    public AuthortController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("/book/{title}/{isbn}")
    public List<Author> getByBookTitle(@PathVariable String title, @PathVariable String isbn) {
        return authorService.findByBookTitle(title, isbn);
    }

}