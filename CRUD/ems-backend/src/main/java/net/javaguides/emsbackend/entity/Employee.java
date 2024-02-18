package net.javaguides.emsbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="user_id",nullable = true)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private  String lastName;

    @Column(name ="email_id",nullable = false)
    private String email;

}
