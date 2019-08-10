package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/test")
public class MyController {

    private final MyPropertyConfigHolder myPropertyConfigHolder;

    public MyController(MyPropertyConfigHolder myPropertyConfigHolder) {
        this.myPropertyConfigHolder = myPropertyConfigHolder;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> test() {

        return Collections.singletonList(myPropertyConfigHolder.getFirst() + " " + myPropertyConfigHolder.getSecond());
    }
}
