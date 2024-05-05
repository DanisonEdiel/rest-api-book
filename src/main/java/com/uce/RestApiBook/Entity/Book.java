package com.uce.RestApiBook.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Book")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 255)
    private  String name;
    @Column(name="image" , length = 650)
    private String image;
    @Column(name="description", length = 650)
    private String description;
    @Column(name ="price")
    private double price;
 }

