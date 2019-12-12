package com.barry.mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * TaskApplication [spring boot] 主方法
 *
 * 启动方式，右键->run/debug->Spring Boot App
 *
 * @author hants
 *
 */
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableScheduling
public class MockitoDemoStarter {

    public static void main(String[] args) {
        SpringApplication.run(MockitoDemoStarter.class, args);
    }

}
