package com.github.kaguya1210.revideos_server.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigContainer {

    public Server server = new Server();

    public static class Server{
        @Value("${server.address}")
        public String address = "localhost";
        @Value("${server.port}")
        public int port = 81;
    }
}
