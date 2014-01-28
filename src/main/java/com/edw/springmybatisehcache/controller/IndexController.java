package com.edw.springmybatisehcache.controller;

import com.edw.springmybatisehcache.bean.Testing;
import com.edw.springmybatisehcache.service.TestingService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private TestingService testingService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public @ResponseBody List<Testing> getAllTesting() {
        return testingService.getAll();
    }
    
    @RequestMapping(value = "/get/{id}", method = RequestMethod.POST)
    public @ResponseBody Testing getSpecificTesting(@PathVariable("id") Integer id) {
        return testingService.getOne(id);
    }

}
