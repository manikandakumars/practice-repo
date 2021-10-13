package com.mani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class ClaimsApp 
{
    public static void main( String[] args )
    {
        System.out.println( "MS Claims Service" );
        ApplicationContext context = SpringApplication.run(ClaimsApp.class, args);
    }
}
