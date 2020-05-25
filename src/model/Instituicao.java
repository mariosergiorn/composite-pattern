package model;

import java.util.ArrayList;

public class Instituicao {
	
	String nome;
	
	public Instituicao(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	ArrayList<Individuo> pessoas = new ArrayList<Individuo>();
	
	public void addIndividuo(Individuo i) {
		pessoas.add(i);
}
	
	public String getMembros(String nome) {
		System.out.println("Membros da instituição "+nome);
		for(Individuo p : pessoas) {
			System.out.println("Nome:"+p.getNome()+" Idade:"+p.getIdade());
		}
		
		return "";
	}
	
}
