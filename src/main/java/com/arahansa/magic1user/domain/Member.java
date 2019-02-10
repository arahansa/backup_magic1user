package com.arahansa.magic1user.domain;


import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Length(min=2)
    @Length(max=20)
    @Email
    @NotBlank
    private String username;

    @Length(min=2)
    private String password;

}
