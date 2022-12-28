package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.modelmapper.ModelMapper;
import org.shiftworksboot.entity.Schedule;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter @Setter @ToString
public class ScheduleFormDto {

    private Integer schId;
    // private Booking booking;
    private String schTitle;
    private String schContent;

    private String startDate;
    private String endDate;

    private String schGroup;
    private String createdBy;

    private static ModelMapper modelMapper = new ModelMapper();

    public Schedule createSchedule() {
        return modelMapper.map(this, Schedule.class);
    }

}
