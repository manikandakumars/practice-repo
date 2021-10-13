package com.mani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Eureka Discovery" );
        ApplicationContext context = SpringApplication.run(App.class, args);
        
    }
}
