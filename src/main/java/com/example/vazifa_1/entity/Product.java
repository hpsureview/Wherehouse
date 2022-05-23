package com.example.vazifa_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int category_id;
    @Column(nullable = false)
    private int photo_id;
    @Column(nullable = false)
    private int code;
    @Column(nullable = false)
    private int measurment_id;
    @Column(nullable = false)
    private boolean active;
    @OneToOne
    Attachment attachment;
    @OneToOne
    Category category;
    @OneToOne
    Measurment measurment;
}
