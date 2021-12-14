package com.bridgelabz.employeepayrollapp.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "payroll")
public class EmployeeEntity {

    @Id
    @Column(name = "eid")
    private int eid;

    @Column(name = "empName")
    private String empName;

    @Column(name = "empGender")
    private String empGender;

    @Column(name = "empDepartment")
    private String empDepartment;

    @Column(name = "empSalary")
    private String empSalary;

    @Column(name = "empStartDate")
    private String empStartDate;

    @Column(name = "empNotes")
    private String empNotes;

    @Column(name = "empImagePath")
    private String empImagePath;
}
