package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.shiftworksboot.constant.TaskDept;

import javax.persistence.*;

@Entity
@Table(name = "task")
@Getter @Setter @ToString
public class Task extends BaseEntity{

    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer taskId;

    @Column(name = "task_title")
    private String taskTitle;

    @Lob
    @Column(name = "task_content")
    private String taskContent;

    @Column(name = "t_private")
    private Character tPrivate;

    @Column(name = "notification")
    private Character notification;

    @Enumerated(EnumType.STRING)
    @Column(name = "dept_id")
    private TaskDept department;

}
