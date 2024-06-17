package com.github.kaguya1210.revideos_server.user.service.impl;

import com.github.kaguya1210.revideos_server.base.exception.ServiceException;
import com.github.kaguya1210.revideos_server.base.response.StatusCode;
import com.github.kaguya1210.revideos_server.user.mapper.UserMapper;
import com.github.kaguya1210.revideos_server.user.pojo.dto.UserLoginParam;
import com.github.kaguya1210.revideos_server.user.pojo.vo.UserVo;
import com.github.kaguya1210.revideos_server.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Statement;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVo login(UserLoginParam userLoginParam) {
        UserVo data = userMapper.select(userLoginParam.getEmail());
        if (data == null) {
            throw new ServiceException(StatusCode.EMAIL_ERROR);
        }
        if (!data.getPassword().equals(userLoginParam.getPassword())) {
            throw new ServiceException(StatusCode.PASSWORD_ERROR);
        }
        return data;
    }
}