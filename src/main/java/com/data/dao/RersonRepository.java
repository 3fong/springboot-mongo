package com.data.dao;

import com.data.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author liulei
 * @Description person 数据层
 * @create 2017/8/2 20:27
 */
public interface RersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);

}

