package controller;
import java.util.HashMap;

import model.Individuo;
import model.Instituicao;

public class Congresso {
	
	public Individuo individuo;
	public Instituicao instituicao;
	
	int numeroAssento = 100;
	HashMap<Individuo, Instituicao> participantes = new HashMap<Individuo, Instituicao>(numeroAssento);
	
	public void adicionarParticipantes(Individuo i, Instituicao it) {
		if(participantes.size() <= numeroAssento){
			if(it == null) {
				participantes.put(i, null);
			}else {
				participantes.put(i, it);
			}
			
		}else
			System.out.println("Reuniao lotada");
	}
	
	public void listarParticipantes(){
		
		participantes.forEach((p, it) -> System.out.println(String.format("Nome: %s | Instituição: %s", p.getNome(), it.getNome())));
		
		//for (Individuo p : participantes.keySet()){
			//System.out.println(p.getNome());
		//}
	}

	public int totalAssentos(){
		return numeroAssento;
	}
	
	
	public String totalParticipante() {
		return "O total de participantes é "+participantes.size();
	}
	
	
}
