package br.com.apilojalivros.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;

    private String status;

    @JsonManagedReference
    @OneToMany(mappedBy = "pk.order")
    private List<OrderProduct> orderProducts = new ArrayList<>();

    @Transient
    public BigDecimal getTotalOrderPrice() {
        BigDecimal sum = new BigDecimal(0.0);
        List<OrderProduct> orderProducts = getOrderProducts();
        for (OrderProduct op : orderProducts) {
            sum = sum.add(op.getTotalPrice());
        }
        return sum;
    }

    @Transient
    public int getNumberOfProducts() {
        return this.orderProducts.size();
    }
}
