package com.Java.WebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
     private Integer prodId;     // Changed from int to Integer
     private String prodName;
     private Integer price;      // Changed from int to Integer
}
