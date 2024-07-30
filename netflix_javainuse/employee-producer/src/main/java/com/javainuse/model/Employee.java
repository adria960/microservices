package com.javainuse.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String empId;
    private String name;
    private String designation;
    private double salary;
}
