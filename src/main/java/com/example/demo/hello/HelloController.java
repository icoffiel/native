package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/hello")
@RestController
public class HelloController {

    private final IHelloService helloService;

    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public List<Hello> hello() {
        return helloService.getAll();
    }

    @PostMapping
    public Hello addHello(@RequestBody Hello hello) {
        return helloService.save(hello);
    }
}
