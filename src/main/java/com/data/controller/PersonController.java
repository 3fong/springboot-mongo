package com.data.controller;

import com.data.dao.PersonDAO;
import com.data.dao.RersonRepository;
import com.data.domain.Location;
import com.data.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author liulei
 * @Description 控制层
 * @create 2017/8/2 20:30
 */
@RestController
public class PersonController {

    @Autowired
    private RersonRepository personRepository;
    @Autowired
    private PersonDAO personDAO;

    @RequestMapping("/save")
    public Person save() {
        Collection<Location> locations = new LinkedHashSet<>();
        Location han = new Location("邯郸", "1599");
        Location xing = new Location("邢台", "1699");
        Location shi = new Location("石家庄", "1899");
        Location heng = new Location("衡水", "1799");
        locations.add(han);
        locations.add(xing);
        locations.add(shi);
        locations.add(heng);
        Person person = new Person("张三", 45);
        person.setLocations(locations);
        return personRepository.save(person);
    }

    @RequestMapping("/name")
    public Person save(String name) {
        return personRepository.findByName(name);
    }

    @RequestMapping("/age")
    public List<Person> findByAge(Integer age) {
        return personRepository.withQueryFindByAge(age);
    }


    @RequestMapping("/set")
    public void setValue() {
        Person person = new Person("王二小", 12);
        personDAO.saveValue2(person);
    }

    @RequestMapping("/init")
    public void initValue() {
        personDAO.saveValue();
    }

    @RequestMapping("/get")
    public String getValue() {
        return personDAO.getValue();
    }
}
