package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.entity.Alarm;

@Getter @Setter @ToString
public class AlarmDto {

    private Integer alarmId;

    private String content;

    private String empId;

    public AlarmDto() {
    }

    public AlarmDto(Alarm alarm) {
        this.alarmId = alarm.getAlarmId();
        this.content = alarm.getContent();
        this.empId = alarm.getEmployee().getEmpId();
    }

}
