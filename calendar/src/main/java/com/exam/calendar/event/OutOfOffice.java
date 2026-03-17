package com.exam.calendar.event;

import java.time.ZonedDateTime;

// 외근 또는 부재 상태(OutOfOffice)를 나타내는 이벤트 클래스
public class OutOfOffice extends AbstractEvent {

    // OutOfOffice 이벤트 생성자
    // 공통 이벤트 정보는 상위 클래스(AbstractEvent)에서 초기화
    public OutOfOffice(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        super(id, title, startAt, endAt);
    }

    // Event 인터페이스의 print() 메서드 구현
    @Override
    public void print() {
        // 외근 또는 부재 상태 이벤트 정보를 출력하는 로직이 들어갈 메서드
    }

    // 현재 이벤트가 OUT_OF_OFFICE 타입을 지원하는지 확인
    @Override
    public boolean support(EventType type) {

        // 전달된 이벤트 타입이 OUT_OF_OFFICE이면 true 반환
        return type == EventType.OUT_OF_OFFICE;
    }

}