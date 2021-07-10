package com.gavin.spt.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexCtroller {
    @RequestMapping(value = "/hello")
    public Object hello() {
        Map<String, String> m = new HashMap<>();
        m.put("ret", "0");
        return m;
    }
}
