package org.shiftworksboot.entity;

import lombok.*;
import org.shiftworksboot.constant.Role;
import org.shiftworksboot.dto.EmployeeFormDto;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter @Setter
@ToString
public class Employee {

    @Id
    @Column(unique = true, name = "emp_id")
    private String empId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_id")
    private Department department;

    private String password;
    private String name;
    private String address;
    private String birthday;
    private String position;
    private String mobile;
    private String internal;
    private String email;

    @Column(name = "entry_date")
    private String entryDate;

    @Column(name = "resignation_date")
    private String resignationDate;

    @Column(name = "digital_sign")
    private String digitalSign;

    @Column(name = "profile_photo")
    private String profilePhoto;

    @Column(name = "failures_num")
    private int failuresNum;

    private String memo;

    @Enumerated(EnumType.STRING)
    private Role authority;

    public static Employee createEmployee(EmployeeFormDto employeeFormDto,
                                          PasswordEncoder passwordEncoder){
        Employee employee = new Employee();

        employee.setEmpId(employeeFormDto.getEmpId());
        String password = passwordEncoder.encode(employeeFormDto.getPassword());
        employee.setName(employeeFormDto.getName());
        employee.setAddress(employeeFormDto.getAddress());
        employee.setBirthday(employeeFormDto.getBirthday());
        employee.setPosition(employeeFormDto.getPosition());
        employee.setMobile(employeeFormDto.getMobile());
        employee.setInternal(employeeFormDto.getInternal());
        employee.setEmail(employeeFormDto.getEmail());
        employee.setEntryDate(employeeFormDto.getEntryDate());
        employee.setResignationDate(employeeFormDto.getResignationDate());

        employee.setPassword(password);
        employee.setAuthority(Role.USER);

        return employee;

    }

}
