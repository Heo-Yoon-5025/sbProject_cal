package com.exam.calendar.event;

// 이벤트가 가져야 할 공통 동작을 정의하는 인터페이스
public interface Event {

    // 이벤트 정보를 출력하는 메서드
    // 각 이벤트 타입(Meeting, Todo 등)이 자신의 방식으로 출력하도록 구현됨
    void print();

    // 전달된 이벤트 타입을 현재 이벤트가 지원하는지 확인하는 메서드
    // 이벤트 타입에 따라 해당 이벤트 객체가 처리 가능한지 판단할 때 사용됨
    boolean support(EventType type);
}