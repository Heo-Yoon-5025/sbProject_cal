package com.exam.calendar;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.calendar.event.AbstractEvent;
import com.exam.calendar.event.Event;
import com.exam.calendar.event.Meeting;
import com.exam.calendar.event.Todo;

// 스프링 부트 애플리케이션의 시작 클래스임을 나타내는 어노테이션
@SpringBootApplication
public class CalendarApplication {

	public static void main(String[] args) {
		// AbstractEvent 타입을 담는 리스트 생성
		List<AbstractEvent> list = new ArrayList<>();

		// 회의 참가자 목록을 담기 위한 HashSet 생성
		HashSet<String> participants = new HashSet<>();
		// 참가자 한 명 추가
		participants.add("danny.kim");

		// Meeting 객체 생성
		Meeting meeting01 = new Meeting(
				1,
				"meeting01",
				ZonedDateTime.now(),
				ZonedDateTime.now().plusHours(1),
				participants,
				"meetingRoomA",
				"스터디");

		// 리스트에 Meeting 추가
		list.add(meeting01);

		// Todo 객체 생성
		Todo todo01 = new Todo(
				2,
				"todo01",
				ZonedDateTime.now(),
				ZonedDateTime.now().plusHours(2),
				"할 일 적기");

		// 리스트에 Todo 추가
		list.add(todo01);

		// 리스트에 담긴 모든 이벤트에 대해 print() 메서드 호출
		list.forEach(Event::print);
	}
}