package com.example.springboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class Controller {
    private List<String> list = Collections.synchronizedList(new ArrayList<>());

    @PostMapping("/save")
    public void save(@RequestBody() String body) {
        list.add(body);
    }

    @GetMapping("/get")
    public String[] get() {
        return list.toArray(new String[0]);
    }

    @DeleteMapping("/delete")
    public void delete() {
        list.clear();
    }

}
