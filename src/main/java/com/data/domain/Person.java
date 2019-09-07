package com.data.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * @author liulei
 * @Description 人员实体类
 * @create 2017/8/2 20:20
 */
@Document
public class Person implements Serializable {

    @Id
    private String id;

    private String name;

    private Integer age;

    // 修改字段名注解 一个人可以有多个工作地点
    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<>();

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<Location> getLocations() {
        return locations;
    }

    public void setLocations(Collection<Location> locations) {
        this.locations = locations;
    }
}
