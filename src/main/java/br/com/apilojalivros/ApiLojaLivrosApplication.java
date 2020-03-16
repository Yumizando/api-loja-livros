package br.com.apilojalivros;

import br.com.apilojalivros.model.Book;
import br.com.apilojalivros.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class ApiLojaLivrosApplication implements CommandLineRunner{

	private final ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(ApiLojaLivrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Book book1 = Book.builder()
//				.id(1l)
//				.title("Trono de vidro (Vol. 1)")
//				.price(new BigDecimal(28.99))
//				.isbn10("8501401382")
//				.isbn13("978-8501401380")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/412-uwlzqrL._SX335_BO1,204,203,200_.jpg")
//				.build();
//		Book book2 = Book.builder()
//				.id(2l)
//				.title("Trono de vidro: Coroa da meia-noite (Vol. 2)")
//				.price(new BigDecimal(32.80))
//				.isbn10("8501401390")
//				.isbn13("978-8501401397")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/51-rMQ7rd2L._SX333_BO1,204,203,200_.jpg")
//				.build();
//		Book book3 = Book.builder()
//				.id(3l)
//				.title("Trono de Vidro: Herdeira do fogo (Vol. 3)")
//				.price(new BigDecimal(36.40))
//				.isbn10("8501401404")
//				.isbn13("978-8501401403")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/51Fru%2BjqFzL._SX335_BO1,204,203,200_.jpg")
//				.build();
//		Book book4 = Book.builder()
//				.id(4l)
//				.title("Trono de vidro: Rainha das sombras (Vol. 4)")
//				.price(new BigDecimal(34.99))
//				.isbn10("8501106844")
//				.isbn13("978-8501106841")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/41GRYCE6HNL._SX335_BO1,204,203,200_.jpg")
//				.build();
//		Book book5 = Book.builder()
//				.id(5l)
//				.title("Trono de Vidro: Império de Tempestades (Vol. 5): Tomo Único")
//				.price(new BigDecimal(55.90))
//				.isbn10("8501112607")
//				.isbn13("978-8501112606")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/51f5G43WyML._SX335_BO1,204,203,200_.jpg")
//				.build();
//		Book book6 = Book.builder()
//				.id(6l)
//				.title("Trono de Vidro: Reino de Cinzas (Vol. 6)")
//				.price(new BigDecimal(58.84))
//				.isbn10("8501116300")
//				.isbn13("978-8501116307")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/51siitwgvuL._SX335_BO1,204,203,200_.jpg")
//				.build();
//		Book book7 = Book.builder()
//				.id(7l)
//				.title("A lâmina da assassina: Histórias de Trono de Vidro")
//				.price(new BigDecimal(34.10))
//				.isbn10("8501103144")
//				.isbn13("978-8501103147")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/51XUaffZZvL._SX334_BO1,204,203,200_.jpg")
//				.build();
//		Book book8 = Book.builder()
//				.id(8l)
//				.title("Torre do alvorecer: Um romance de Trono de vidro")
//				.price(new BigDecimal(41.93))
//				.isbn10("8501114456")
//				.isbn13("978-8501114457")
//				.publisher("Galera")
//				.language("Português")
//				.pictureUrl("https://images-na.ssl-images-amazon.com/images/I/51fMabcuUwL._SX334_BO1,204,203,200_.jpg")
//				.build();
//		productService.save(book1);
//		productService.save(book2);
//		productService.save(book3);
//		productService.save(book4);
//		productService.save(book5);
//		productService.save(book6);
//		productService.save(book7);
//		productService.save(book8);
	}
}
