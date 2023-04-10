package com.cydeo.entity;

import com.cydeo.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int paidPrice;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


}
