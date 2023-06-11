package br.com.mentorama.helloworld.processors;

import org.springframework.stereotype.Component;

import br.com.mentorama.helloworld.entities.Message;

@Component
public class RemoverPalavrasIndevidas implements Processor {

    @Override
    public void process(Message message) {
        System.out.println("Removendo ");
    }

}
