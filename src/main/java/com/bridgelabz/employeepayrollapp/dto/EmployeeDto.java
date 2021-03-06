package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * Purpose: Employee DTO to carry data between processes.
 *
 * @author Siraj
 * @version 1.0
 * @since 05-12-2021
 **/
@Data
public class EmployeeDto {

    private int eid;

    @NotNull
    @Pattern(regexp = "^[A-Za-z ]{3,28}$", message = "The name can not contain any numbers or symbols.")
    private String empName;

    @NotNull
    @Pattern(regexp = "^[A-Z]$", message = "The gender should be one character in length")
    private String empGender;

    @NotNull
    private List<String> empDepartment;

    @NotNull
    @Pattern(regexp = "^[0-9]{4,7}$", message = "Salary can not contain any alphabets and can not be larger than 7 digits")
    private String empSalary;

    @NotNull
    @Pattern(regexp = "^[0-3][0-9]/[0-9]{1,2}/[2][0-9]{3}$", message = "Please provide valid date and in the format : dd/mm/YYYY")
    private String empStartDate;

    @NotNull
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "Password must contain at least one upper case + lower case english letter, at least one digit, at least one special character and should be minimum eight in length")
    private String empPassword;

    @NotNull
    private String empNotes;

    @NotNull
    @Pattern(regexp = "^[/][A-Za-z]{1,18}[/][A-Za-z0-9]{1,30}.jpg$", message = "Invalid file path")
    private String empImagePath;

}
