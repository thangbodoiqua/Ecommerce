package com.project.ecommerce.service;

import com.project.ecommerce.response.SignupRequest;

public interface AuthService {
    String createUser(SignupRequest req);
}
