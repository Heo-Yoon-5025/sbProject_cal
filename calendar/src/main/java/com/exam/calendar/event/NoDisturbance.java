package com.exam.calendar.event;

import java.time.ZonedDateTime;

// 방해 금지(NoDisturbance) 상태를 나타내는 이벤트 클래스
public class NoDisturbance extends AbstractEvent {

    // NoDisturbance 이벤트 생성자
    // 공통 이벤트 정보는 AbstractEvent 생성자를 통해 초기화
    public NoDisturbance(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        super(id, title, startAt, endAt);
    }

    // Event 인터페이스의 print() 메서드 구현
    @Override
    public void print() {
        // 방해 금지 이벤트 정보를 출력
    }

    // 현재 이벤트가 NO_DISTURBANCE 타입을 지원하는지 확인
    @Override
    public boolean support(EventType type) {
        return type == EventType.NO_DISTURBANCE;
    }

}