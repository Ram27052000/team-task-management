package org.teamtaskmanagement.teamtask.Models;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "employee_seq", allocationSize=1)
    private int id;
    private String name;
    private String email;
    private String position;
    private double salary;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
}
