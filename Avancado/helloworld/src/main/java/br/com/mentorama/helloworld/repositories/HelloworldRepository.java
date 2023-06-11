package br.com.mentorama.helloworld.repositories;

import br.com.mentorama.helloworld.entities.Message;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class HelloworldRepository {
    private final List<Message> messages;

    public HelloworldRepository(List<Message> messages) {
        this.messages = new LinkedList<>();
    }

    public List<Message> findAll() {

        return messages;
    }

    public List<Message> findAll(String message) {

        return messages.stream()
                .filter(msg -> msg.getMessage().contains(message))
                .collect(Collectors.toList());

    }

    public Message findByid(Integer id) {
        return this.messages.stream().filter(msg -> msg.getId().equals(id)).findFirst().orElse(null);
    }

    public Integer add(Message message) {
        if (message.getId() == null) {
            message.setId(messages.size() + 1);
        }
        messages.add(message);

        return message.getId();
    }

    public List<Message> update(Message message) {

        messages.stream().filter(msg -> msg.getId().equals(message.getId()))
                .forEach(msg -> msg.setMessage(message.getMessage()));
        return messages;
    }

    public void delete(Integer id) {

        messages.removeIf(msg -> msg.getId().equals(id));

    }
}
