package dev.tias.authentication;

import jakarta.enterprise.context.SessionScoped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@SessionScoped
@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserSession {
    private String username;
    private String password;
    private String role;
}
