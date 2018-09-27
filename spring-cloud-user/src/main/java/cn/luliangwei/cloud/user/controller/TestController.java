package cn.luliangwei.cloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Environment env;
    
    @GetMapping("/test/prop")
    public String readValue() {
        
        return env.getProperty("test.prop");
    }
}
