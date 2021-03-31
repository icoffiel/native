package com.example.demo.hello;

import java.util.List;

public interface IHelloService {
    List<Hello> getAll();

    Hello save(Hello hello);
}
