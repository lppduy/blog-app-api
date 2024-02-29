package com.lppduy.blog.service;

import com.lppduy.blog.payload.LoginDTO;
import com.lppduy.blog.payload.RegisterDTO;

public interface AuthService {
    String login(LoginDTO loginDTO);
    String register(RegisterDTO registerDTO);

}
