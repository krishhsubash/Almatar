package com.playwright.java.config;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@Embeddable
public class AlmatarAppSettings {
    private String almatarUrl;
    private String username;
    private String password;
}
