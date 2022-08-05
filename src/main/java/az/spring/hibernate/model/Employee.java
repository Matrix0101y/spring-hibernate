package az.spring.hibernate.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "emp_name", length = 25)
    private String name;

    @Column(length = 35)
    private String surname;

    private int age;
    private Double salary;

}
