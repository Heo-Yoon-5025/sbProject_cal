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

@SpringBootApplication
public class CalendarApplication {

	public static void main(String[] args) {
		List<AbstractEvent> list = new ArrayList<>();
		HashSet<String> participants = new HashSet<>();
		participants.add("danny.kim");

		Meeting meeting01 = new Meeting(1, "meeting01", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1),
				participants, "meetingRoomA", "스터디");

		list.add(meeting01);

		Todo todo01 = new Todo(2, "todo01", ZonedDateTime.now(), ZonedDateTime.now().plusHours(2),
				"할 일 적기");

		list.add(todo01);

		list.forEach(Event::print);
	}

}
