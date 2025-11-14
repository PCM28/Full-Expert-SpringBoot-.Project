package com.pcm.fintech.content.modules.user.infrastructure.controller.dto.input;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInputDto {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "Not empty name")
    @Size(min = 2, max = 50,message = "Firstname must have 2 - 50 characters")
    private String firstName;

    @NotBlank(message = "Not empty lastname")
    @Size(min = 2, max = 50,message = "Lastname must have 2 - 50 characters")
    private String lastName;

    @Past(message = "Birthdate must be in the past")
    private LocalDate birthdate;

    @NotBlank(message = "Not empty title")
    @Size(min = 2, max = 50,message = "Title must have 2 - 50 characters")
    private String title;

    @NotBlank(message = "Not empty profile description")
    @Size(min = 2, max = 250,message = "Profile description must have 2 - 250 characters")
    private String profileDescription;

    @URL(message = "Invalid profile Img url")
    private String profileImgUrl;

    @Min(value = 0, message = "Not negative years")
    private Integer yearsOfExperience;

    @DecimalMin(value = "0.01", message = "Amount must be bigger than 0")
    @DecimalMin(value = "9999999.99", message = "Amount must be lower than 10,000,000.00")
    private BigDecimal amount;

    @Email(message = "Invalid Email")
    private String email;

    @NotNull(message = "Not empty phone")
    private String phone;

    @URL(message = "Invalid linked url")
    private String linkedinUrl;

    @URL(message = "Invalid github url")
    private String githubUrl;

    @URL(message = "Invalid socialMedia url")
    private String socialMediaUrl;

    @AssertTrue(message = "User must accept the terms")
    private Boolean termsAccepted;

    //@Valid
    //@NotNull(message = "Not empty address")
    //private Address addres;
}
