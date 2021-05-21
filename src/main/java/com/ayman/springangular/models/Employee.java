package com.ayman.springangular.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@ToString(exclude = {"id"})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Setter@Getter
    private String firstName;
    @Setter@Getter
    private String lastName;
    @Setter@Getter
    private String password;
    @Setter@Getter
    private String email;

}
