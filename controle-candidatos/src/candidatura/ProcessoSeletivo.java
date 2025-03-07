package candidatura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("Processo Seletivo".toUpperCase());
		
		analisarCandidato(1900.0);
		analisarCandidato(2100.0);
		analisarCandidato(2000.0);
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
