package com.data.dao;

import com.data.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author liulei
 * @Description person 持久层
 * @create 2017/8/2 21:28
 */
@Repository
public class PersonDAO {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    // 属性注入
    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> operations;

    @Autowired
    RedisTemplate redisTemplate;

    // 属性注入
    @Resource(name = "redisTemplate")
    ValueOperations<String, Object> operationObjects;

    public void saveValue() {
        operations.set("liu", "lei");
    }

    public String getValue() {
        return operations.get("liu");
    }

    public void saveValue2(Person person) {
        operationObjects.set("java", person);
    }
}
