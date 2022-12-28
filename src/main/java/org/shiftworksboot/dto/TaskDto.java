package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.constant.TaskDept;
import org.shiftworksboot.entity.Task;
import org.shiftworksboot.entity.TaskFile;
import org.shiftworksboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class TaskDto {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Integer taskId;
    private String taskTitle;
    private String taskContent;
    private Character tPrivate;
    private Character notification;

    private String createBy;
    private String writer;

    // 첨부파일 list
    private List<TaskFileDto> fileList = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    private TaskDept department;


    // Task 객체를 Task Dto로 변환
    public TaskDto(Task task) {
        this.taskId = task.getTaskId();
        this.taskTitle = task.getTaskTitle();
        this.taskContent = task.getTaskContent();
        this.tPrivate = task.getTPrivate();
        this.notification = task.getNotification();
        this.department = task.getDepartment();
        this.createBy = task.getCreatedBy();
    }

    public TaskDto() {}
}
