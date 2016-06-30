package com.example.controllers;

import com.example.domain.Human;
import com.example.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Игорь on 29.06.2016.
 */
@RestController
//@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class HumanController {

    @Autowired
    private HumanService humanService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello there !";
    }

    @RequestMapping(value = "/humans", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Human> findAll() {
        final List<Human> resultList = new ArrayList<>();
        final Iterable<Human> all = humanService.findAll();
        all.forEach(new Consumer<Human>() {
            @Override
            public void accept(Human human) {
                resultList.add(human);
            }
        });
        return resultList;
    }
}
