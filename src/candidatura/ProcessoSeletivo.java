package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
//		analisarCandidato(1900.0);
//		analisarCandidato(2200.0);
//		analisarCandidato(2000.0);
//		selecaoCandidatos();
		imprimirSelecionados();
		
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		for(int indice= 0 ; indice < candidatos.length;indice++) {
			System.out.println("O candidat de numero " + indice + " é " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de iteração for each");
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado é : " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Maria","Daniel","Marcelo"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase=2000.0;
		while(candidatosSelecionados<5 && candidatosAtual< candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
			if(salarioBase>=salarioPretendido) {
				candidatosSelecionados++;
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase>salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase==salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
