package com.arahansa.magic1user.domain;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
public class Member {

    @Min(value=2)
    @Max(value = 10)
    @Email
    @NotBlank
    private String username;

    @Min(value=2)
    private String password;

}
