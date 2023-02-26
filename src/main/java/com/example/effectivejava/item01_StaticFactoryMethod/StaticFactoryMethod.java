package com.example.effectivejava.item01_StaticFactoryMethod;

public class StaticFactoryMethod {

    // 클래스는 생성사와 별도로 정적 팩토리 메소드(static factory method)를 제공할 수 있다.
    // 정적 팩토리 메소드란? 객체 생성의 역할을 하는 클래스 메소드

    // 기본타입인 boolean 값을 받아 Boolean 객체 참조로 변환해 준다.
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    // * 정적 팩토리 메소드의 장점
    /*
        1. 이름을 가질 수 있다.
        2. 호출될 때마다 인스턴스를 새로 생성하지 않아도 된다.
        3. 반환 타입의 하위 타입 객체를 반환할 수 있다.
        4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
        5. 정적 팩토리 메소드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
    */

    // * 정적 팩토리 메소드의 단점
    /*
        1. 상속을 하려면 public 이나 protected 생성자가 필요하니 정적 팩토리 메소드만 제공하면 하위 클래스를 만들 수 없다.
        2. 정적 팩토리 메소드는 프로그래머가 찾기 어렵다.
        3. 선택적 매개변수를 받을 때, 대응하기 어렵다.
    */

    // * 정적 팩토리 메소드에 흔히 사용하는 명명 방식들
    /*
        from :  매개변수를 하나 받아서 해당 타입의 인스턴스를 반환하는 형변환 메소드
        of : 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 집계 메소드
        valueOf : from 과 of 를 합친? 메소드
        instance || getInstance : 인스턴스를 반환하지만, 같은 인스턴스일 수 있다.
        create || newInstance : 매번 새로운 인스턴스를 반환한다.
        get[Type:메소드가 반환할 객체의 타입] : getInstance 와 같으나, 생성할 클래스가 아닌 다른 클래스의 팩토리 메소드 정의
        new[Type:메소드가 반환할 객체의 타입] : newInstance 와 같으나, 생성할 클래스가 아닌 다른 클래스의 팩토리 메소드 정의
        type : get/new Type 의 간결한 버전, 다른 타입의 새로운 인스턴스 생성
    */

} // end
