package tech.buildrun.springsecurity.controller.dto;

public record LoginResponse (String acessToken, Long expiresIn) {
}
