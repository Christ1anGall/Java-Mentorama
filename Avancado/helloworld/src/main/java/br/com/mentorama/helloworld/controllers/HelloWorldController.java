package br.com.mentorama.helloworld.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mentorama.helloworld.entities.Message;
import br.com.mentorama.helloworld.services.HelloWorldService;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {
    private final List<Message> messages;

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController() {
        this.messages = new ArrayList<>();
    }

    @GetMapping
    public List<Message> findAll(@RequestParam(required = false) String message) {

        return helloWorldService.findAll(message);
    }

    @GetMapping("/{id}")
    public Message findByid(@PathVariable("id") Integer id) {
        return helloWorldService.findByid(id);
    }

    @PostMapping
    public ResponseEntity<Integer> add(@RequestBody final Message message) {
        return new ResponseEntity<>(helloWorldService.add(message), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity update(@RequestBody final Message message) {

        return new ResponseEntity<>(helloWorldService.update(message), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        helloWorldService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
