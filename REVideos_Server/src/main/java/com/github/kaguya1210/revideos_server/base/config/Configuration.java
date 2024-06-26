package com.github.kaguya1210.revideos_server.base.config;

import com.github.kaguya1210.revideos_server.base.utils.JsonUtils;
import io.micrometer.common.lang.Nullable;
import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.io.IOException;
import static com.github.kaguya1210.revideos_server.ReVideosServerApplication.configDir;
@Slf4j
public class Configuration extends ConfigContainer{
    public static void saveConfig(@Nullable ConfigContainer config) {
        if (config == null) config = new ConfigContainer();

        try (FileWriter file = new FileWriter(configDir)) {
            file.write(JsonUtils.encode(config));
        } catch (IOException ignored) {
            log.error("无法写入配置文件.");
        } catch (Exception e) {
            log.error("无法保存配置文件.", e);
        }
    }
}
