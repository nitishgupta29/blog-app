package com.nitish.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.PrivateKey;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {
    private String message;
    private boolean success;
}
