package br.com.apilojalivros.service;

import br.com.apilojalivros.model.Livro;

public interface ProdutoService {

    Iterable<Livro> getAllBooks();
}
