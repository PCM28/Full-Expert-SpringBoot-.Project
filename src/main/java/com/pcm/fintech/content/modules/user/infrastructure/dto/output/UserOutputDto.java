package com.pcm.fintech.content.modules.user.infrastructure.dto.output;

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
public class UserOutputDto {
//También hay outputDtos que son UserDetails que sería en princpio este y luego el normal que entiendo sería cuando es un listado que se´ria el nombre de este a secas userOutputdto y luego otro para el search, ver, entender adaptar el de hipoges a mi estilo + el de mi proyeco foundations
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
    //private Address addres;
}
