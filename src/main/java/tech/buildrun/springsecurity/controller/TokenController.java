package tech.buildrun.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.buildrun.springsecurity.controller.dto.LoginRequest;
import tech.buildrun.springsecurity.controller.dto.LoginResponse;
import tech.buildrun.springsecurity.reposioty.UserRepository;

@RestController
public class TokenController {

    private final JwtDecoder jwtDecoder;
    private final UserRepository userRepository;

    public TokenController(JwtDecoder jwtDecoder,UserRepository userRepository){
        this.jwtDecoder = jwtDecoder;
        this.userRepository = userRepository;
    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        var user = userRepository.findByUsername(loginRequest.username());

        if(user.isEmpty()){
            throw new BadCredentialsException("user or password is inválid");
        }
    }

}
