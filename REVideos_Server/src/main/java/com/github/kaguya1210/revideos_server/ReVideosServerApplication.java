package com.github.kaguya1210.revideos_server;

import com.github.kaguya1210.revideos_server.base.config.ConfigContainer;
import com.github.kaguya1210.revideos_server.base.utils.JsonUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

@SpringBootApplication
@Slf4j
public class ReVideosServerApplication {

    public static final File configDir = new File("./config.json");
    @Getter
    public static ConfigContainer config;

    static {
        try {
            if (!configDir.exists() || configDir.length() == 0) {
                configDir.createNewFile();
                try (FileWriter file = new FileWriter(configDir)) {
                    config = new ConfigContainer();
                    file.write(JsonUtils.encode(config));
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }else {

                config = JsonUtils.decode(new String(Files.readAllBytes(configDir.toPath())), ConfigContainer.class);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(ReVideosServerApplication.class, args);
    }

}
