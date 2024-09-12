package edu.dio.contaBancaria;

public class ContaTerminal {
    private Cliente cliente;
    private double saldo;

    public ContaTerminal(Cliente cliente, double saldoInicial) {
        this.cliente =cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$: " + valor + " Realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para deposito.");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " Realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }

    public double getSaldo(){
        return saldo;
    }
    /*
    public Cliente getCliente() {
        return cliente;
    }

     */



}
