package com.example.config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: FAuditore
 * Date: 2020/6/3
 * Time: 21:57
 */
@RestController
@RefreshScope
public class Controller {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Override
    public String toString() {
        return "Controller{" +
                "applicationName='" + applicationName + '\'' +
                ", eurekaServer='" + eurekaServer + '\'' +
                '}';
    }

    @RequestMapping("/config")
    public String getConfig(){
        System.out.println(this);
        return this.toString();
    }
}
