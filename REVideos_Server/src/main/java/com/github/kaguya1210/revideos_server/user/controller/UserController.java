package com.github.kaguya1210.revideos_server.user.controller;

import com.github.kaguya1210.revideos_server.base.response.JsonResult;
import com.github.kaguya1210.revideos_server.user.pojo.dto.UserLoginParam;
import com.github.kaguya1210.revideos_server.user.pojo.vo.UserVo;
import com.github.kaguya1210.revideos_server.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@Tag(name = "用户管理")
@RestController
@RequestMapping("/v3/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "登录")
    @PostMapping("/login")
    public JsonResult Login(UserLoginParam userLoginParam) {
        log.debug(userLoginParam.toString());
        UserVo login = userService.login(userLoginParam);
        return JsonResult.ok(login);
    }

    @Operation(summary = "注册")
    @PostMapping("/reg/{email}")
    public JsonResult reg(@PathVariable String email) {
        log.debug(email);
        return JsonResult.ok(email);
    }

}
