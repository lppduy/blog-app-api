package com.lppduy.blog.service;

import com.lppduy.blog.dtos.LoginDTO;
import com.lppduy.blog.dtos.RegisterDTO;

public interface AuthService {
    String login(LoginDTO loginDTO);
    String register(RegisterDTO registerDTO);

}
