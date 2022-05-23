package com.example.vazifa_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private int warehouse_id;
    @Column(nullable = false)
    private int  currency_id;
    @Column(nullable = false)
    private int  facture_number;
    @Column(nullable = false)
    private int code;
    @Column(nullable = false)
    private int  client_id;
    @OneToOne
    Client client;
    @OneToOne
    Currency currency;
    @OneToOne
    Wherehouse wherehouse;
}
