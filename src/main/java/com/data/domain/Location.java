package com.data.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author liulei
 * @Description 工作地点
 * @create 2017/8/2 20:24
 */
public class Location {
    // 工作地点
    private String place;

    // 工作年限
    private String year;

    public Location() {
    }

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
