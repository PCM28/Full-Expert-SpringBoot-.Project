package com.pcm.fintech.content.modules.user.infrastructure.repository.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="Users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name",nullable = false )
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "profile_description", nullable = false)
    private String profileDescription;

    @Column(name = "profile_img_url", nullable = false)
    private String profileImgUrl;

    @Column(name = "years_of_experience", nullable = false)
    private Integer yearsOfExperience;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

    @Column(name = "linkedin_url", nullable = false)
    private String linkedinUrl;

    @Column(name = "github_url", nullable = false)
    private String githubUrl;

    @Column(name = "social_media_url", nullable = false)
    private String socialMediaUrl;

    @Column(name = "terms_accepted", nullable = false)
    private Boolean termsAccepted;

    //también están insertable=false/true y updatable=fasle/true, solo para Id foráneas
}
