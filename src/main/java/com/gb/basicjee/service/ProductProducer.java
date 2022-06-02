package com.gb.basicjee.service;

import com.gb.basicjee.entity.Product;

public class ProductProducer {
    public Product createProduct(int id, String title, double price){
        return new Product(id,title,price);
    }
}
