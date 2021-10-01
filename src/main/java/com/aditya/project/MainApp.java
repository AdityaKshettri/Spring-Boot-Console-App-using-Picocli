package com.aditya.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp
{
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(MainApp.class, args)));
    }
}
