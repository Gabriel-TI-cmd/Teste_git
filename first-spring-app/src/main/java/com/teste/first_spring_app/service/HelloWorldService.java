package com.teste.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String name){
        return "Hello World! " + name;
    }
}
// O @Service indica ao Spring que a classe HelloWorldService é uma classe de serviço;
// Outra classe que pedir uma instância dessa classe de service, o Spring irá conseguir gerenciar a injeção de uma dependência na outra classe que tiver uma dependência com essa classe de serviço;
// Uma classe de service é onde a regra de negócio, ou funcionalidades da aplicação, irão ser inseridos, ou seja, os serviços;
// Aqui na classe de serviço é onde a lógica da aplicação acontece, em vez de fazer isso na classe controller;
// Na classe controller será feito o acesso à classe de service;