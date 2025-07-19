package com.project.ecommerce.controller;

import com.project.ecommerce.domain.USER_ROLE;
import com.project.ecommerce.modal.User;
import com.project.ecommerce.repository.UserRepository;
import com.project.ecommerce.response.AuthResponse;
import com.project.ecommerce.response.SignupRequest;
import com.project.ecommerce.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final UserRepository userRepository;

    private final AuthService authService;

    @PostMapping("/auth")
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req) {

        String jwt = authService.createUser(req);

        AuthResponse res = new AuthResponse();
        res.setJwt(jwt);
        res.setMessage("Register successfully");
        res.setRole(USER_ROLE.ROLE_CUSTOMER);

        return ResponseEntity.ok(res);
    }



}
