package br.com.mentorama.helloworld.processors;

import org.springframework.stereotype.Component;

import br.com.mentorama.helloworld.entities.Message;

@Component
public class ContarPalavras implements Processor {

    @Override
    public void process(Message message) {
        System.out.println("contando");
    }

}
