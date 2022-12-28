package org.shiftworksboot.entity;

import lombok.*;
import org.shiftworksboot.constant.Role;

import javax.persistence.*;

@Entity
@Table(name = "department")
@Getter @Setter
@ToString
public class Department {

    @Id
    @Column(name = "dept_id")
    private String deptId;

    @Column(name = "dept_name")
    private String deptName;

    @Enumerated(EnumType.STRING)
    private Role authority;

}
