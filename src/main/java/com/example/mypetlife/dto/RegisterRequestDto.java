package com.example.mypetlife.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RegisterRequestDto {

    @NotBlank(message = "이름을 입력하세요")
    private String username;

    @NotBlank(message = "이메일을 입력하세요")
    @Email(message = "잘못된 이메일입니다")
    private String email;

    @NotBlank(message = "패스워드를 입력하세요")
    private String password;

    private String phone;

    private String birthDate;

    @NotBlank(message = "반려동물 종을 입력하세요")
    private String petSpices;
}