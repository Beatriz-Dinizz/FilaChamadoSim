package model;

public class Cliente {
	public int numero;
	public String nome;
	
	public Cliente(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + nome + " (Senha: " + numero + ")";
	}
}
