package br.com.mentorama.helloworld.processors;

import br.com.mentorama.helloworld.entities.Message;

public interface Processor {

    void process(Message message);
}