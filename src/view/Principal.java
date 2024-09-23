package view;

import controller.Fila;
import FilaGenerica.Fila;  
import model.Cliente;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Fila<Cliente> fila = new Fila<>();
        Fila<Cliente> filaPrioritarios = new Fila<>();
        Fila controller = new Fila();

        int opcao;
        int numeroSenha = 1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu:\n" +
                "1. Inserir nova senha (não prioritário)\n" +
                "2. Inserir nova senha (prioritário)\n" +
                "3. Chamar cliente\n" +
                "4. Sair"
            ));

            switch (opcao) {
                case 1:
                    String nomeCliente = JOptionPane.showInputDialog("Nome do cliente:");
                    Cliente cliente = new Cliente(numeroSenha++, nomeCliente);
                    controller.inserirFila(fila, cliente);
                    break;
                case 2:
                    String nomePrioritario = JOptionPane.showInputDialog("Nome do cliente prioritário:");
                    Cliente clientePrioritario = new Cliente(numeroSenha++, nomePrioritario);
                    controller.inserirFila(filaPrioritarios, clientePrioritario);
                    break;
                case 3:
                    controller.chamarCliente(filaPrioritarios, fila);
                    break;
                case 4:
                    System.out.println("Finalizando.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }
}
