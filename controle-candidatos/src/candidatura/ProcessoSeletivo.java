package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		imprimirSelecionados();
//		selecaoCandidatos();
	}

	static void imprimirSelecionados() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };

		System.out.println("Imprimindo lista de candidatos informando o indece do elemento");

//		for (int indice = 0; indice < candidatos.length; indice++) {
//			System.out.println("O candidato de Nº " + (indice + 1) + " é "+candidatos[indice]);
//		}

		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}

	static void selecaoCandidatos() {
		String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
				"DANIELA", "JORDAN" };

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;

		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato!".toUpperCase());
		} else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta!".toUpperCase());
		} else {
			System.out.println("Aguardando recultado dos demais candidatos!".toUpperCase());
		}
	}

}
