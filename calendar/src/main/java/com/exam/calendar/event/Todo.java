package com.exam.calendar.event;

import java.time.ZonedDateTime;

// 할 일(Todo) 이벤트를 표현하는 클래스
public class Todo extends AbstractEvent {
    // 할 일에 대한 설명
    private String description;

    // Todo 객체 생성자
    public Todo(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt,
            String description) {
        // 공통 필드는 상위 클래스 생성자를 통해 초기화
        super(id, title, startAt, endAt);

        // Todo 고유 필드 초기화
        this.description = description;
    }

    // Event 인터페이스의 print() 메서드 구현
    @Override
    public void print() {
        // 할 일 정보를 출력
        System.out.printf("[할 일] %s : %s%n", getTitle(), description);
    }
}