package miu.edu.demo.service;

import miu.edu.demo.model.LoginRequest;
import miu.edu.demo.model.LoginResponse;
import miu.edu.demo.model.RefreshTokenRequest;

public interface UaaService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
