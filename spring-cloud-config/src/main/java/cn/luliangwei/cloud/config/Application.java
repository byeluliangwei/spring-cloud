package cn.luliangwei.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Server
 */
@EnableConfigServer
@SpringBootApplication
public class Application 
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
