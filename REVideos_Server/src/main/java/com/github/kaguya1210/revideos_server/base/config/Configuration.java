package com.github.kaguya1210.revideos_server.base.config;

import static com.github.kaguya1210.revideos_server.ReVideosServerApplication.config;

public class Configuration extends ConfigContainer{
    public final static ConfigContainer c = config;

    public final static Server SEVER = c.server;
}
