package com.github.kaguya1210.revideos_server.base.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.github.kaguya1210.revideos_server.*.mapper")
public class MybatisConfig {
}
