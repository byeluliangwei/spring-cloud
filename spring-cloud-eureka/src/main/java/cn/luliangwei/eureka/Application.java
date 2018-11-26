package cn.luliangwei.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *spring cloud eureka Server 
 *
 *based on spring boot 1.5.x
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
