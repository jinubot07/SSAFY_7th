package com.ssafy.day5.collection;

public class SmartPhone  {
    String number;

    public SmartPhone(String number) {
        this.number = number;
    }

    public String toString() {
        return "전화 번호: " + number;
    }
    // TODO: 동일한 번호의 SmartPhone이면 하나만 추가될 수 있도록 처리하시오.
    // END:

    // TODO: SmartPhone을 비교 가능하게 만들어보자.
    // END:
}
