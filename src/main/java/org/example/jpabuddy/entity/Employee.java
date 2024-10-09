package org.example.jpabuddy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee", schema = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Size(max = 50)
    @NotNull
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private Character gender;

    @Size(max = 100)
    @Column(name = "email", length = 100)
    private String email;

    @Size(max = 20)
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Size(max = 100)
    @Column(name = "job_title", length = 100)
    private String jobTitle;

    @Size(max = 50)
    @Column(name = "department", length = 50)
    private String department;

    @Column(name = "salary", precision = 10, scale = 2)
    private BigDecimal salary;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "manager_id")
    private Integer managerId;

    @Size(max = 100)
    @Column(name = "work_location", length = 100)
    private String workLocation;

    @Lob
    @Column(name = "notes")
    private String notes;

}