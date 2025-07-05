package com.easyshop.easy_shop.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class LoginRequest {
    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
