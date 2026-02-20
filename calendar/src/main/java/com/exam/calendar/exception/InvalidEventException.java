package com.exam.calendar.exception;

// 잘못된 이벤트 데이터가 들어왔을 때 사용하는 예외 클래스
public class InvalidEventException extends RuntimeException {
    // 예외 메시지를 받아 부모 클래스(RuntimeException)에 전달
    public InvalidEventException(String message) {
        super(message);
    }
}