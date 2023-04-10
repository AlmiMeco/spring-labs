package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
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

}
