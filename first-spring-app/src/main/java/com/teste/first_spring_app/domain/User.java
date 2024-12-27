package com.teste.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name; // Não irá funcionar o getter e o setter automatizado pelo spring agora, porque, provavelmente, não estou com a IDE Ultimate;
    private String email; // O mesmo vale aqui;
// Usar getters e setters manualmente:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
