package edu.dio.contaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cliente, digite seu nome por favor.");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite sua agência");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        Cliente cliente = new Cliente(nome, agencia, numero);

        System.out.println("Digite um valor para deposito");
        double saldoInicial = scanner.nextDouble();
        ContaTerminal conta = new ContaTerminal(cliente, saldoInicial);

        int opcao;

        do {
            System.out.println("\nBem vindo(a), " + cliente.getNome() + " você está no DioBank! escolha uma opçao:");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é R$: " + conta.getSaldo());
                    break;

                case 2:
                    System.out.println("Digite o valor para depósito");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.println("Digite o valor para saque, saldo disponível para saque é R$: " + conta.getSaldo());

                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o DioBank. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
