package org.shiftworksboot.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "work_sch")
@Getter @Setter @ToString
public class WorkSch {

    @Id
    @Column(name = "emp_id")
    private String empId;

    @Column(name = "dept_id")
    private String department;

    @Column(name = "start_time")
    private String startTime;

    @Column(name = "end_time")
    private String endTime;

}
