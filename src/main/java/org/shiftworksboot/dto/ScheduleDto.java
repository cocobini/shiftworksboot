package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.entity.Booking;
import org.shiftworksboot.entity.Schedule;

import java.time.LocalDateTime;

@Getter @Setter @ToString
public class ScheduleDto {

    private Integer schId;

    // 예약 기능 연동 시 추가
    // private Booking booking;

    private String schTitle;
    private String schContent;
    private String startDate;
    private String endDate;
    private String schGroup;
    private String createdBy;
    private String schDate;

    public ScheduleDto() {}

    public ScheduleDto(Schedule schedule) {
        this.schId = schedule.getSchId();
        this.schTitle = schedule.getSchTitle();
        this.schContent = schedule.getSchContent();
        this.startDate = schedule.getStartDate();
        this.endDate = schedule.getEndDate();
        this.schGroup = schedule.getSchGroup();
        this.createdBy = schedule.getCreatedBy();
    }

}
