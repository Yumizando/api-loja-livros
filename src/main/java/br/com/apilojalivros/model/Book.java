package br.com.apilojalivros.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private BigDecimal price;

    @Column
    private String isbn10;

    @Column
    private String isbn13;

    @Column
    private String publisher;

    @Column
    private String language;

    @Column
    private String pictureUrl;
}
