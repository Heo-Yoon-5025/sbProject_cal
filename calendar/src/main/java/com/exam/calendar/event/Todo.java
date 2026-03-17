package com.exam.calendar.event;

import java.time.ZonedDateTime;

// 할 일(Todo) 이벤트를 표현하는 클래스
public class Todo extends AbstractEvent {

    // 해야 할 작업에 대한 상세 설명
    private String description;

    // Todo 객체 생성자
    public Todo(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt,
            String description) {

        // 공통 이벤트 정보(id, title, 시작시간, 종료시간)를 상위 클래스에서 초기화
        super(id, title, startAt, endAt);

        // Todo 이벤트에 대한 설명을 초기화
        this.description = description;
    }

    // Event 인터페이스의 print() 메서드 구현
    @Override
    public void print() {

        // 할 일 이벤트의 제목과 설명을 콘솔에 출력
        System.out.printf("[할 일] %s : %s%n", getTitle(), description);
    }

    // 현재 이벤트가 TO_DO 타입을 지원하는지 확인
    @Override
    public boolean support(EventType type) {

        // 전달된 이벤트 타입이 TO_DO이면 true 반환
        return type == EventType.TO_DO;
    }
}