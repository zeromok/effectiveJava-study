package com.example.effectivejava.item01_StaticFactoryMethod;

public class example01 {

    public static void main(String[] args) {

        // Ex)
        // 정적 팩토리 메소드
        String str1 = String.valueOf("Hi"); // Hi, valueOf 라는 이름을 가지고 있다.
        // new 생성자
        String str2 = new String("Hi"); // Hi

        // ========================
        // 장점 1. 이름을 가질 수 있다.
        // ========================
        // new
        Product product1 = new Product("book", 1000);
        Product product2 = new Product("pencil");

        // 정적 팩토리 메소드
        Product.register("note", 500);
        Product.registerNoPrice("book");

    }

} // end
