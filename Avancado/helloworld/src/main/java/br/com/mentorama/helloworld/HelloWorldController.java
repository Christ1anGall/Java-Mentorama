package br.com.mentorama.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {
    private final String message = "Hello World Batata";

    @GetMapping
    public String HelloWorld() {
        return message;
    }

}
