package com.jpa.associations.repo;

import com.jpa.associations.entity.many_to_many.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<Author, Long> {
    //    List<Author> findByBooksTitleAndBooksIsbn(String title, String isbn);
    List<Author> findByBooksTitleAndBooks_Isbn(String title, String isbn);

}
