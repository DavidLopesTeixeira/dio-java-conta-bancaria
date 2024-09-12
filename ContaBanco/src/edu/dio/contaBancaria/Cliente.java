package edu.dio.contaBancaria;

public class Cliente {
    String nome;
    String agencia;
    int numero;

    // Aqui eu criei um construtor para a classe cliente
    public Cliente(String nome, String agencia, int numero) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;

    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

}
