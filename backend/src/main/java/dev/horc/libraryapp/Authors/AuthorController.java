package dev.horc.libraryapp.Authors;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    
    @Autowired
    private AuthorService authorService; 

    @GetMapping
    public List<Author> GetAll() {
        return authorService.GetAll();
    }
}
