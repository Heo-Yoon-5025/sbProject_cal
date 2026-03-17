package com.exam.calendar.event;

import java.time.ZonedDateTime;
import java.util.Set;

// 회의(Meeting) 이벤트를 표현하는 클래스
public class Meeting extends AbstractEvent {

    // 회의에 참여하는 참가자들의 목록
    private Set<String> participants;

    // 회의가 진행되는 회의실 이름
    private String meetingRoom;

    // 회의에서 다룰 주요 안건
    private String agenda;

    // Meeting 객체 생성자
    public Meeting(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt, Set<String> participants,
            String meetingRoom, String agenda) {

        // 공통 이벤트 속성(id, title, 시작시간, 종료시간)을 상위 클래스에서 초기화
        super(id, title, startAt, endAt);

        // Meeting 클래스에서만 사용하는 필드 초기화
        this.participants = participants; // 회의 참가자 설정
        this.meetingRoom = meetingRoom; // 회의실 설정
        this.agenda = agenda; // 회의 안건 설정
    }

    // Event 인터페이스의 print() 메서드 구현
    @Override
    public void print() {

        // 회의 타입과 제목, 안건을 콘솔에 출력
        System.out.printf("[회의] %s : %s%n", getTitle(), agenda);
    }

    // 현재 이벤트가 MEETING 타입을 지원하는지 확인
    @Override
    public boolean support(EventType type) {

        // 전달된 이벤트 타입이 MEETING이면 true 반환
        return type == EventType.MEETING;
    }
}