package com.example.controllers;

import com.example.domain.Races;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Игорь on 29.06.2016.
 */
@RestController
public class RacesController {

    @RequestMapping(value = "/races", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Races[] getRaces() {
        return Races.values();
    }
}
