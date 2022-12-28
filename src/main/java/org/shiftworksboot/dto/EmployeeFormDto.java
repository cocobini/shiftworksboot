package org.shiftworksboot.dto;

import lombok.Getter;
import lombok.Setter;
import org.shiftworksboot.entity.Department;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter @Setter
public class EmployeeFormDto {

    @NotBlank(message = "필수 입력 값입니다.")
    private String empId;
    @NotBlank(message = "필수 입력 값입니다.")
    private String password;

    private String name;
    private String address;
    private String birthday;
    private String position;
    private String mobile;
    private String internal;
    private String email;
    private String entryDate;
    private String resignationDate;

}
