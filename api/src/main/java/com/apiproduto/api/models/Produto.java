package com.apiproduto.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @Getter 
@Setter
@NoArgsConstructor  // Cria um construtor sem argumentos (construtor padrão).
@AllArgsConstructor // Cria um construtor com todos os atributos da classe como parâmetros.
@EqualsAndHashCode(of = "id")  // Gera automaticamente os métodos equals() e hashCode() com base nos atributos da classe, facilitando comparações entre objetos.
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; 
    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    
}
