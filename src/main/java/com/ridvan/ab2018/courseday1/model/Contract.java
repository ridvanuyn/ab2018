package com.ridvan.ab2018.courseday1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contract {

    @Id
    private Integer id;
    private String name;
    private String surname;
    private Integer countryCode;
    private String phoneNumber;
    private String emailAdress;

}
