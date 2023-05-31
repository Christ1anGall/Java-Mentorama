package br.com.mentorama.helloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {
    private final String message = "Hello World";
    private final List<Message> messages;

    public HelloWorldController() {
        this.messages = new ArrayList<>();

        Message message2 = new Message(1, message);
        Message message3 = new Message(2, message);
        Message message4 = new Message(3, message);

        this.messages.add(message2);
        this.messages.add(message3);
        this.messages.add(message4);
    }

    @GetMapping
    public List<Message> HelloWorld() {
        return messages;
    }

}
