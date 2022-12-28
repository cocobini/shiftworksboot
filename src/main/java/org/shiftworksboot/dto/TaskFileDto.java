package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.modelmapper.ModelMapper;
import org.shiftworksboot.entity.Task;
import org.shiftworksboot.entity.TaskFile;

@Getter @Setter @ToString
public class TaskFileDto {

    private String uuid;

    private Task task;

    private String fileName;

    private String fileSrc;


    public TaskFileDto () {
    }

    public TaskFileDto (TaskFile taskFile) {
        this.uuid = taskFile.getUuid();
        this.task = taskFile.getTask();
        this.fileName = taskFile.getFileName();
        this.fileSrc = taskFile.getFileSrc();
    }
    private static ModelMapper modelMapper = new ModelMapper();
    public TaskFile createTaskFile() {
        return modelMapper.map(this, TaskFile.class);
    }


}
