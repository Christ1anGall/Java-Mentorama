package br.com.mentorama.helloworld2;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {
    private final String message = "Hello World";

    @GetMapping
    public String findAll() {

        return this.message;
    }

}
