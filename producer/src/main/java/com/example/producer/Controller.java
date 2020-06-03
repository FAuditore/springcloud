package com.example.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/5/27
 * Time: 22:28
 */
@RestController
public class Controller {

    @RequestMapping("/producer")
    public String Hello(){
        return "Hello consumer";
    }
}
