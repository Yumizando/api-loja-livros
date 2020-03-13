package br.com.apilojalivros.service;


import br.com.apilojalivros.exception.ResourceNotFoundException;
import br.com.apilojalivros.model.Book;

interface ProductService {

    Iterable<Book> getAllBooks();

    Book getBookById(Long id) throws ResourceNotFoundException;

    Book save(Book book);
}
