package com.example.effectivejava.item01_StaticFactoryMethod;

public class Product {

    private String name;

    private int price;

    // 모든 필드에 대응되는 파라미터를 받는 생성자
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // name 만을 매개변수로 갖는 생성자
    public Product(String name) {
        this.name = name;
        this.price = 0;
    }

    static Product register(String name, int price) {
        return new Product(name, price);
    }

    static Product registerNoPrice(String name) {
        return new Product(name);
    }

} // end
