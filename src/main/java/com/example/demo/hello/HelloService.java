package com.example.demo.hello;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HelloService implements IHelloService {
    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public List<Hello> getAll() {
        return helloRepository.findAll();
    }

    @Override
    public Hello save(Hello hello) {
        return helloRepository.save(hello);
    }
}
