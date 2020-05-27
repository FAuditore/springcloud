package com.example.producer;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/5/27
 * Time: 22:28
 */
@RestController
public class Controller {

    @RequestMapping("/helloProducer")
    public String Hello(){
        return "Hello consumer";
    }
}
