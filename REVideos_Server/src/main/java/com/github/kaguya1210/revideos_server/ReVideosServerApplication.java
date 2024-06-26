package com.github.kaguya1210.revideos_server;

import com.github.kaguya1210.revideos_server.base.config.ConfigContainer;
import com.github.kaguya1210.revideos_server.base.config.Configuration;
import com.github.kaguya1210.revideos_server.base.utils.JsonUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

@SpringBootApplication
public class ReVideosServerApplication {

    public static final File configDir = new File("./config.json");

    static {
        try {
            if (!configDir.exists() || configDir.length() == 0) {
                configDir.createNewFile();
                ConfigContainer config = new ConfigContainer();
                try (FileWriter file = new FileWriter(configDir)) {
                    file.write(JsonUtils.encode(config));
                } catch (Exception e) {
                    throw new RuntimeException();
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(ReVideosServerApplication.class, args);
    }

}
