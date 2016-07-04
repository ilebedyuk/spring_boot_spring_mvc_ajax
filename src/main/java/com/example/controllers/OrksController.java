package com.example.controllers;

import com.example.domain.Orks;
import com.example.services.OrksService;
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
public class OrksController {

    @Autowired
    private OrksService orksService;

    @RequestMapping(value = "/orks", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Orks> findAll() {
        final List<Orks> resultList = new ArrayList<>();
        final Iterable<Orks> all = orksService.findAll();
        all.forEach(new Consumer<Orks>() {
            @Override
            public void accept(Orks orks) {
                resultList.add(orks);
            }
        });
        return resultList;
    }
}
