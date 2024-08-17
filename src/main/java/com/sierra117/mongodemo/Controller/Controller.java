package com.sierra117.mongodemo.Controller;

import com.sierra117.mongodemo.Entity.MyLIfe;
import com.sierra117.mongodemo.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ServiceImpl service;

    @PostMapping("/hello")
    public MyLIfe save(@RequestBody MyLIfe myLIfe) {
        return service.saveData(myLIfe);
    }
}
