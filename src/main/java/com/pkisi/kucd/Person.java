package com.pkisi.kucd;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Person {
    @NotNull
    @Pattern(regexp = "[0-9]{11}")
    private String pesel;
}
