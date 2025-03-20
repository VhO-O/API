package com.api.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "product") // Definindo que essa classe é uma entidade
@Table(name = "product") // Definindo que haverá uma tabela no banco de dados com o nome "product"
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Simplifica a geração de Id
    private Integer id;
    private String name;
    private Long price;

    public Product(){}

    public Product(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
