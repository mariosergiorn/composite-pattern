package model;

public class Individuo{
	
	private String nome;
	private int idade;
	
	public Individuo(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Individuo() {}

	public void infoPessoa() {
		System.out.println("Participante: "+nome+" Idade: "+idade);
	}
	
}
