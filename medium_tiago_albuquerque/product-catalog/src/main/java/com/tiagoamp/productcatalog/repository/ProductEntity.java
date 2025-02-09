package com.tiagoamp.productcatalog.repository;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product_entity")
public class ProductEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
}

//@GeneratedValue(strategy = GenerationType.AUTO) Auto is using default
// IDENTITY - increments by 1