package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.shiftworksboot.constant.TaskDept;
import org.shiftworksboot.entity.Task;
import org.shiftworksboot.entity.TaskFile;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class TaskFormDto {

    private Integer taskId;
    private String taskTitle;
    private String taskContent;
    private Character tPrivate;
    private Character notification;
    private TaskDept department;


    // 첨부파일 저장을 위한 list
    private List<TaskFileDto> fileList = new ArrayList<>();


    // Task 객체 - TaskFormDto 객체 변환을 위한 모델 매퍼
    private static ModelMapper modelMapper = new ModelMapper();

    public Task createTask() {
        // 매핑전략(dept_id가 task_id에 매핑되는 것 방지)
        modelMapper.typeMap(TaskFormDto.class, Task.class).addMappings(mapper -> {
            mapper.map(TaskFormDto::getDepartment, Task::setDepartment);
        });
        return modelMapper.map(this, Task.class);
    }

}
