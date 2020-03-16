package br.com.apilojalivros.controller;

import br.com.apilojalivros.model.Book;
import br.com.apilojalivros.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping(value = { "", "/"})
    public @NotNull Iterable<Book> getAllBooks(){
        return productService.getAllBooks();
    }
}
