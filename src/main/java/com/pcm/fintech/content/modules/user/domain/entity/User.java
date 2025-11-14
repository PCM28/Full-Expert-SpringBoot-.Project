package com.pcm.fintech.content.modules.user.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String title;
    private String profileDescription;
    private String profileImgUrl;
    private Integer yearsOfExperience;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
}
