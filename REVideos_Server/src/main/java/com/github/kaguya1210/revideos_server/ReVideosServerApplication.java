package com.github.kaguya1210.revideos_server;

import com.github.kaguya1210.revideos_server.base.config.ConfigContainer;
import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ReVideosServerApplication {

    public static final File configDir = new File("./config.json");
    @Getter
    public static ConfigContainer config;
    public static void main(String[] args) {
        SpringApplication.run(ReVideosServerApplication.class, args);
    }

}
