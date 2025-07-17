package com.project.ecommerce.controller;

import com.project.ecommerce.modal.User;
import com.project.ecommerce.repository.UserRepository;
import com.project.ecommerce.response.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final UserRepository userRepository;

    @PostMapping("/auth")
    public ResponseEntity<User> createUserHandler(@RequestBody SignupRequest req) {

        User user = new User();
        user.setEmail(req.getEmail());
        user.setFullName(req.getFullName());

        User savedUser = userRepository.save(user);

        return ResponseEntity.ok(savedUser);
    }



}
