package br.com.apilojalivros.service;

import br.com.apilojalivros.exception.ResourceNotFoundException;
import br.com.apilojalivros.model.Book;
import br.com.apilojalivros.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public Book getBookById(Long id) throws ResourceNotFoundException {
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Livro não encontrado."));
    }

    @Override
    @Transactional
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
