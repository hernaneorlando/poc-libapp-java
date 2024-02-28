package dev.horc.libraryapp.Authors;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> GetAll() {
        var authors = authorRepository.findAll();
        authors.sort(Comparator.comparing(Author::getFirstName));
        return authors;
    }
}
