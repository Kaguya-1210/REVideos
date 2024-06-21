package com.github.kaguya1210.revideos_server.user.mapper;

import com.github.kaguya1210.revideos_server.user.pojo.entity.User;
import com.github.kaguya1210.revideos_server.user.pojo.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    UserVo select(String email);

    UserVo insert(User user);
}
