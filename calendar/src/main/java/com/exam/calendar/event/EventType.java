package com.exam.calendar.event;

// 시스템에서 사용되는 이벤트의 종류를 정의하는 열거형(enum)
public enum EventType {

    // 회의 일정 이벤트
    MEETING,

    // 해야 할 작업(Task) 이벤트
    TO_DO,

    // 방해 금지 상태를 나타내는 이벤트
    NO_DISTURBANCE,

    // 외근 또는 부재 상태를 나타내는 이벤트
    OUT_OF_OFFICE

}