package com.gb.basicjee.entity;

public class Product {
    private int id;
    private String title;
    private double coast;

    public Product(int id, String title, double coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", coast=" + coast +
                '}';
    }
}
