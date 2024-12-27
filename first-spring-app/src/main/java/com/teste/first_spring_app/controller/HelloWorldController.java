package com.teste.first_spring_app.controller;

import com.teste.first_spring_app.domain.User;
import com.teste.first_spring_app.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    // O método helloWorld() escuta o endpoint /hello-world pelo método http GET;
    // Poderia ser usado a anotação @Autowired para a dependência abaixo, assim o spring injetaria automaticamente, na classe helloWorld(), a dependência helloWorldService sem a necessidade de construtor;
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Gabriel");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value="filter") String filter, @RequestBody User bodyUser){ // O que for inserido no body, pelo cliente, será injetado nesse parâmetro pelo spring;
        return "Hello World, " + bodyUser.getName() + id + filter;
        // Nesse método seria recebido os valores que o cliente enviou pelo body da requisição;
    }
}
// Não foi criado uma instância da classe na mão com o new, e sim foi recebido por parâmetro a instância por meio do construtor HelloWorldController;
// O Spring foi quem passou a instância da classe no construtor, ou seja, ele que fez a injeção da dependência;
// O application.properties é útil para termos as configurações gerais da aplicação;
// Podemos definir, no application.properties, as portas, ou até os perfis com suas respectivas portas, em que a aplicação será inicializada;
// Isso pode até ser feito por meio de uma variável de ambiente configurada por meio do próprio Intellij em Edit Configuration;
