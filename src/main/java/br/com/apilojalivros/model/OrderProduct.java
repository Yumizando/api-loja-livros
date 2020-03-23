package br.com.apilojalivros.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderProduct {

    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;

    @Column(nullable = false)
    private Integer quantity;

    @Transient
    public Book getProduct() {
        return this.pk.getBook();
    }

    @Transient
    public BigDecimal getTotalPrice() {
        return getProduct().getPrice().multiply(BigDecimal.valueOf(getQuantity()));
    }
}
