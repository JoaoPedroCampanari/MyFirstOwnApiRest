package me.dio.service.impl;

import me.dio.domain.model.Book;
import org.springframework.stereotype.Service;
import me.dio.domain.repository.BookRepository;
import me.dio.service.BookService;

import java.util.NoSuchElementException;

@Service
public class BookServiceImpl implements BookService {


    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Book create(Book bookCreate) {

        if (bookCreate.getId() != null && bookRepository.existsById(bookCreate.getId())){
            throw new IllegalArgumentException("This ID alredy exist.");
        } else if (bookRepository.existsByBookName(bookCreate.getBookName())) {
            throw new IllegalArgumentException("This Book Name alredy exist.");
        }

        return bookRepository.save(bookCreate);
    }

    @Override
    public void remove(Long id) {

        if (!bookRepository.existsById(id)){
            throw new IllegalArgumentException("This book not exist");
        }

        bookRepository.deleteById(id);
    }
}
