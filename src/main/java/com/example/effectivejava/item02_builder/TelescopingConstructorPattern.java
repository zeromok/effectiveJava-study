package com.example.effectivejava.item02_builder;

public class TelescopingConstructorPattern {

    // 개발자들은 정적 팩토리 메서드 단점에 대응하기 위한 첫번째 대안
    // * 점층적 생성자 패턴
    /*
    * 단점
    * 매개변수가 많을수록 많은 조합이 만들어질 수밖에 없다.
    * 클래스의 생성자를 호출하는 입장에서 제대로 호출했는지 확인이 필요하다.
    * 매개변수의 타입이 같은경우 생성자를 만들 수 없다.
    * */

    private final String name;
    private final int age;
    private final String sex;
    private final String phone;
    private String address; // * 선택
    private String email; // * 선택
    private String note;  // * 선택

    // 모든 매개변수를 가지는 생성자
    public TelescopingConstructorPattern(String name, int age, String sex, String phone, String address, String email, String note) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.note = note;
    }

    // 필수 매개변수를 가지는 생성자
    public TelescopingConstructorPattern(String name, int age, String sex, String phone) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    // 필수 매개변수 + 선택 매개변수 address 를 가지는 생성자
    public TelescopingConstructorPattern(String name, int age, String sex, String address, String phone) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }

    // 필수 매개변수 + 선택 매개변수 email 를 가지는 생성자
    // 매개변수는 다르지만 타입이 같은 String 이라서 오류...!
    /*public telescopingConstructorPattern(String name, int age, String sex, String phone, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
    }*/

} // end
