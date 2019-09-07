package com.data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liulei
 * @Description mongodb 配置文件
 * @create 2017/8/2 21:01
 */
@Component
@ConfigurationProperties(prefix = "spring.data.mongodb")
public class MongoConfig {
    private String host;
    private Integer port;
    private String uri;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
