package com.exam.calendar.event;

import java.time.Duration;
import java.time.ZonedDateTime;

import com.exam.calendar.exception.InvalidEventException;

// 모든 이벤트의 공통 속성과 동작을 담는 추상 클래스
public abstract class AbstractEvent implements Event {

    // 이벤트 고유 식별자 (각 이벤트를 구분하기 위한 값)
    private final int id;

    // 이벤트 제목
    private String title;

    // 이벤트 시작 시간
    private ZonedDateTime startAt;

    // 이벤트 종료 시간
    private ZonedDateTime endAt;

    // 시작 시간과 종료 시간 사이의 기간(자동 계산되는 값)
    private Duration duration;

    // 이벤트가 생성된 시각 (생성 이후 변경되지 않음)
    private final ZonedDateTime createdAt;

    // 이벤트가 마지막으로 수정된 시각
    private ZonedDateTime modifiedAt;

    // 이벤트 삭제 여부 (true이면 삭제된 상태)
    private boolean deletedYn;

    // 하위 클래스에서만 호출할 수 있는 생성자
    protected AbstractEvent(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt) {

        // 시작 시간이 종료 시간보다 늦으면 예외 발생
        if (startAt.isAfter(endAt)) {
            throw new InvalidEventException(
                    String.format("시작일은 종료일보다 이전이어야 합니다. 시작일=%s, 종료일=%s", startAt, endAt));
        }

        // 전달받은 값으로 이벤트 기본 정보 초기화
        this.id = id;
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;

        // 시작 시간과 종료 시간의 차이를 계산하여 duration 필드에 저장
        this.duration = Duration.between(startAt, endAt);

        // 현재 시각을 기준으로 생성 시각과 수정 시각을 초기화
        ZonedDateTime now = ZonedDateTime.now();
        this.createdAt = now;
        this.modifiedAt = now;

        // 이벤트 생성 시 기본적으로 삭제되지 않은 상태로 설정
        this.deletedYn = false;
    }

    // 이벤트 제목을 반환하는 메서드
    public String getTitle() {
        return title;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }
}