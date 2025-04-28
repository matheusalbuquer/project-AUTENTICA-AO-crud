package tech.buildrun.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    private final JwtDecoder jwtDecoder;

    public TokenController(JwtDecoder jwtDecoder){
        this.jwtDecoder = jwtDecoder;
    }


    @PostMapping("/login")
    public ResponseEntity<UserD>
}
