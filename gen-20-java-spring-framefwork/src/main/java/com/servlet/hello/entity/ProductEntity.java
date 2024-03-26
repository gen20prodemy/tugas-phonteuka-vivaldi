package com.servlet.hello.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ProductEntity {
    private Long id;
    private String nama;
    private String berat;
    private double harga;
}
