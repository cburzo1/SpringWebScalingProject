package model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String gender;
    @Column
    private String department;
    @Column
    private Date dob;

    //Generate Setters and Getters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    //ToString:
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", dob=" + dob +
                '}';
    }


    /*This annotation tells JPA/Hibernate how to
    automatically generate values for the primary key of an entity
    (usually annotated with @Id). AUTO_INCREMENT*/

    /*
a real-world object or concept that you want to store information about.

It typically corresponds to a table in a database.

Each row in the table represents a specific instance of that entity.*/
}
