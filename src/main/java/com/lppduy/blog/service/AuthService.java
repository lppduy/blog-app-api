package com.lppduy.blog.service;

import com.lppduy.blog.dtos.LoginDTO;

public interface AuthService {
    String login(LoginDTO loginDTO);
}
