package com.example.vazifa_1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User_Werehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    @Column(nullable = false)
    private int wherehouse_id;
    @OneToOne
    Wherehouse wherehouse;
    @OneToOne
    User user;
}
