package com.pcm.fintech.content.modules.user.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthdate;
    private String title;
    private String profileDescription;
    private String profileImgUrl;
    private Integer yearsOfExperience;
    private BigDecimal amount;
    private String email;
    private String mobileNumber;
    private String linkedinUrl;
    private String githubUrl;
    private String socialMediaUrl;
    private Boolean termsAccepted;
}
