package controller;

import lib.FilaGenerica;
import model.Cliente;

public class Fila {
    private int contadorPrioritarios = 0;

    public void inserirFila(Fila<Cliente> fila, Cliente cliente) {
        fila.enfileirar(cliente);
        System.out.println(cliente + " foi adicionado à fila.");
    }

    public void atenderCliente(Fila<Cliente> fila) {
        if (!fila.estaVazia()) {
            Cliente atendido = fila.desenfileirar();
            System.out.println(atendido + " está sendo atendido.");
        } else {
            System.out.println("Nenhum cliente na fila para ser atendido.");
        }
    }

    public void chamarCliente(Fila<Cliente> filaPrioritarios, Fila<Cliente> filaNaoPrioritarios) {
        if (!filaPrioritarios.estaVazia() && contadorPrioritarios < 3) {
            atenderCliente(filaPrioritarios);
            contadorPrioritarios++;
        } else if (!filaNaoPrioritarios.estaVazia()) {
            atenderCliente(filaNaoPrioritarios);
            contadorPrioritarios = 0; 
        } else if (!filaPrioritarios.estaVazia()) {
            atenderCliente(filaPrioritarios);
        } else {
            System.out.println("Nenhum cliente para ser atendido.");
        }
    }
}