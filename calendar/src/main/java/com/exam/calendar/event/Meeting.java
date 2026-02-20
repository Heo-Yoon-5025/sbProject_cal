package com.exam.calendar.event;

import java.time.ZonedDateTime;
import java.util.Set;

// 회의(Meeting) 이벤트를 표현하는 클래스
public class Meeting extends AbstractEvent {

    // 회의 참가자 목록
    private Set<String> participants;
    // 회의실 이름
    private String meetingRoom;
    // 회의 안건
    private String agenda;

    // Meeting 객체 생성자
    public Meeting(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt, Set<String> participants,
            String meetingRoom, String agenda) {
        // 공통 필드는 상위 클래스 생성자를 통해 초기화
        super(id, title, startAt, endAt);

        // Meeting 고유 필드 초기화
        this.participants = participants;
        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
    }

    // Event 인터페이스의 print() 메서드 구현
    @Override
    public void print() {
        // 회의 정보를 출력
        System.out.printf("[회의] %s : %s%n", getTitle(), agenda);
    }
}