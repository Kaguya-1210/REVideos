package com.github.kaguya1210.revideos_server.user.service;

import com.github.kaguya1210.revideos_server.user.pojo.dto.UserLoginParam;
import com.github.kaguya1210.revideos_server.user.pojo.vo.UserVo;
import org.springframework.stereotype.Service;


public interface UserService {
    UserVo login(UserLoginParam userLoginParam);
}
