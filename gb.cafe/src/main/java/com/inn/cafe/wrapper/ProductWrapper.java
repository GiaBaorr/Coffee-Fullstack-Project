package com.inn.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductWrapper {

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private String status;
    private Integer categoryId;
    private String categoryName;

    public ProductWrapper() {
    }

    public ProductWrapper(Integer id, String name, String description, Double price, String status, Integer categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.status = status;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
}
