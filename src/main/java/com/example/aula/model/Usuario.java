package com.example.aula.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @NotBlank(message = "Sexo é obrigatório.")
    private String sexo;

    @NotBlank(message = "Idade é obrigatório.")
    private String idade;

    @NotBlank(message = "Altura é obrigatório.")
    private String altura;

    @NotBlank(message = "Peso é obrigatório.")
    private String peso;

    @NotBlank(message = "Posição é obrigatório.")
    private String posicao;

    @NotBlank(message = "Número da Camisa é obrigatório.")
    private String numeroDaCamisa;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String sexo, String idade, String altura, String peso, String posicao, String numeroDaCamisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.numeroDaCamisa = numeroDaCamisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Sexo é obrigatório.") String getSexo() {
        return sexo;
    }

    public void setSexo(@NotBlank(message = "Sexo é obrigatório.") String sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "Idade é obrigatório.") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "Idade é obrigatório.") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Altura é obrigatório.") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "Altura é obrigatório.") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "Peso é obrigatório.") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "Peso é obrigatório.") String peso) {
        this.peso = peso;
    }

    public @NotBlank(message = "Posição é obrigatório.") String getPosicao() {
        return posicao;
    }

    public void setPosicao(@NotBlank(message = "Posição é obrigatório.") String posicao) {
        this.posicao = posicao;
    }

    public @NotBlank(message = "Número da Camisa é obrigatório.") String getNumeroDaCamisa() {
        return numeroDaCamisa;
    }

    public void setNumeroDaCamisa(@NotBlank(message = "Número da Camisa é obrigatório.") String numeroDaCamisa) {
        this.numeroDaCamisa = numeroDaCamisa;
    }
}
