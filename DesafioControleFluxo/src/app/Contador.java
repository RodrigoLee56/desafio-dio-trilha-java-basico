package app;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

		System.out.print("Por favor, digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();

		System.out.print("Por favor, digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		terminal.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Contagem: " + i);
		}
	}

}
