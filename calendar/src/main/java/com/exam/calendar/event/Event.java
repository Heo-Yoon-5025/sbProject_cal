package com.exam.calendar.event;

// 이벤트가 가져야 할 공통 동작을 정의하는 인터페이스
public interface Event {
    // 각 이벤트가 자신의 정보를 출력하는 메서드
    void print();
}