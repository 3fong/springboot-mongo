package com.data;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author liulei
 * @Description
 * @create 2017/8/5 11:01
 */
public class RedisConfig {
    @Value("${redis.host}")
    public String host;

    @Value("${redis.port}")
    public String port;

}
