package com.nithin.springbootpractice.composition;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CompositionDataLoader implements CommandLineRunner {

    private final LibraryRepository libraryRepository;

    public CompositionDataLoader(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public void run(String... args) {
        Library library = new Library();
        Book book1 = new Book();
        book1.setTitle("Sample Book 1");
        book1.setAuthor("Author 1");
        Book book2 = new Book();
        book2.setTitle("Sample Book 2");
        book2.setAuthor("Author 2");
        library.setBooks(Arrays.asList(book1, book2));
        libraryRepository.save(library);
        
        //PH2
        libraryRepository.delete(library);
        
    }
}
