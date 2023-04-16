package com.cydeo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int paidPrice, totalPrice;

    @OneToOne
    private Cart cart;

    @OneToOne
    private Payment payment;

    @ManyToOne
    private Customer customer;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", paidPrice=" + paidPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
