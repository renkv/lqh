package com.lqh.website;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class LqhApplication {

    private final static Logger logger = LoggerFactory.getLogger(com.lqh.website.LqhApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(LqhApplication.class, args);
        logger.info(com.lqh.website.LqhApplication.class.getSimpleName() + " is success!");
    }
}

