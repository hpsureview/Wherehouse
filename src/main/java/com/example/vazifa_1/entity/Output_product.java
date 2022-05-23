package com.example.vazifa_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private int product_id;
    @Column(nullable = false)
    private int amount;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private int output_id;
    @OneToOne
    Product product;
    @OneToOne
    Output output;

}
