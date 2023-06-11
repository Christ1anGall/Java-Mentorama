package br.com.mentorama.helloworld.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.mentorama.helloworld.entities.Message;
import br.com.mentorama.helloworld.processors.Processor;
import br.com.mentorama.helloworld.repositories.HelloworldRepository;

@Service
public class HelloWorldService {

    private HelloworldRepository helloworldRepository;

    @Autowired
    private List<Processor> processor;

    public List<Message> findAll(@RequestParam(required = false) String message) {

        if (message != null) {

            return helloworldRepository.findAll(message);
        }

        return helloworldRepository.findAll();
    }

    public Message findByid(@PathVariable("id") Integer id) {
        return helloworldRepository.findByid(id);
    }

    public Integer add(@RequestBody final Message message) {

        return helloworldRepository.add(message);
    }

    public List<Message> update(@RequestBody final Message message) {

        return helloworldRepository.update(message);
    }

    public void delete(@PathVariable Integer id) {

        helloworldRepository.delete(id);

    }

}
