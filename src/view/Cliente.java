package view;
import controller.Congresso;
import model.Individuo;
import model.Instituicao;

public class Cliente {
	
	public static void main(String[] args) {
		
		Individuo i0 = new Individuo("Mario", 21);
		Individuo i1 = new Individuo("Junior", 10);
		Individuo i2 = new Individuo("Paulo", 16);
		Individuo i3 = new Individuo("Vitor", 30);
		
		Instituicao inst = new Instituicao("Equipe tapa buraco");
		inst.addIndividuo(i0);
		inst.addIndividuo(i1);
		
		System.out.println(inst.getMembros(inst.getNome()));
		
		Instituicao inst1 = new Instituicao("Trem bala da colina");
		inst1.addIndividuo(i2);
		inst1.addIndividuo(i3);
		
		Congresso cc = new Congresso();
		
		cc.adicionarParticipantes(i0, inst);
		cc.adicionarParticipantes(i1, inst);
		cc.adicionarParticipantes(i2, inst1);
		cc.adicionarParticipantes(i3, inst1);
		
		cc.listarParticipantes();
		System.out.println(cc.totalParticipante());
		
	}

}
