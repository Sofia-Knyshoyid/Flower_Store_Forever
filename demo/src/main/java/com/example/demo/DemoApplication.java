package com.example.demo;

import com.example.demo.flowers.Flower;
import com.example.demo.flowers.FlowerBucket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<Flower> hello() {
        return Arrays.asList(new Flower("green", 50, 100),
                new Flower("blue", 50, 100),
                new Flower("white", 50, 100));
    }

}
