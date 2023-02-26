package com.example.effectivejava.item02_builder;

public class BuilderPattern {

    // 점층적 생성자 패턴과 자바 빈즈 패턴의 장점만을 취한 빌더 패턴
    /*
    * 필드 전체가 선택값이거나 일부만 필수 값일때 사용 적절 하다.
    * 계층적으로 설계된 클래스와 잘 어울린다.
    * 클라이언트가 읽고 쓰기 쉽다.
    * 간결하고 안전하다.
    * */

    private final String name;
    private final int age;
    private final String sex;
    private final String phone;
    private final String address; // * 선택
    private final String email; // * 선택
    private final String note;  // * 선택


    public static class Builder {
        // 필수
        private final String name;
        private final int age;
        private final String sex;
        private final String phone;

        // 선택 = 기본값 초기화
        private String address = null; // * 선택
        private String email = null; // * 선택
        private String note = null;  // * 선택

        // 필수 매개변수를 가지는 생성자
        public Builder(String name, int age, String sex, String phone) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.phone = phone;
        }

        // Builder 의 Setter 메서드들
        // 자기 자신을 반환하기 때문에 연속적인 호출 가능
        // ====================================================
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder note(String note) {
            this.note = note;
            return this;
        }
        // ====================================================

        // 자기 자신으로 이루어진 생성자 반환
        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

    } // Builder()


    private BuilderPattern(Builder builder) {
        name = builder.name;
        age = builder.age;
        sex = builder.sex;
        phone = builder.phone;
        address = builder.address;
        email = builder.email;
        note = builder.note;
    }


} // end

class BuilderClient {
    BuilderPattern pb = new BuilderPattern.Builder("test", 30, "남자", "01000000000")
            .address("")
            .email("")
            .note("")
            .build();
}

