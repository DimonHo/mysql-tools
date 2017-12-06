package com.wd.tools.mysqltools.controller;

import com.wd.tools.mysqltools.service.TOrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DimonHo on 2017/12/5.
 */
@RestController
public class TestController {
    @Autowired
    TOrgService tOrgService;
    @GetMapping("test")
    public String findAll(){
        tOrgService.test();
        return "ok";
    }
}
