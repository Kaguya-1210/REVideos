package com.github.kaguya1210.revideos_server.user.pojo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UserLoginParam {
    @Schema(description = "用户邮箱")
    private String email;
    @Schema(description = "用户密码")
    private String password;
}
