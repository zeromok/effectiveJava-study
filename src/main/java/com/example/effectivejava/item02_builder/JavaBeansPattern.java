package com.example.effectivejava.item02_builder;

public class JavaBeansPattern {

    // 개발자들은 정적 팩토리 메서드 단점에 대응하기 위한 두번째 대안
    // * 자바 빈즈 패턴

    /*
    * Setter 메서드를 호출해 원하는 매개변수의 값을 설정하는 방법
    * 단점
    * 객체를 완성하기까지 여러번 메서드를 호출해야한다.
    * 불변의 객체를 만들 수 없다.
    * */

    private String name;
    private int age;
    private String sex;
    private String phone;
    private String address; // * 선택
    private String email; // * 선택
    private String note;  // * 선택

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNote(String note) {
        this.note = note;
    }


} // end

class Client {
    public static void main(String[] args) {

        JavaBeansPattern jbp = new JavaBeansPattern();
        jbp.setName("test");
        jbp.setAddress("서울시 동작구");
        jbp.setAge(30);
        // ...

    }
}
