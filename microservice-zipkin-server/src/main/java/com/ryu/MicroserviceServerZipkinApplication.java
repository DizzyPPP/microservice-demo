package com.ryu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class MicroserviceServerZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceServerZipkinApplication.class, args);
    }
}
