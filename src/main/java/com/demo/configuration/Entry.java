package com.demo.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wangy
 * @contact QQ 837195190
 * @created by thinkpad on 2017/8/29.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.demo")
public class Entry {
    public static void main(String args[]){
        SpringApplication.run(Entry.class, args);
    }
}
