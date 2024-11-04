package model;

public class SuperSomador {

	/*
	 * 4) Desenvolva uma classe SuperSomador com um método estático somarValores()
	 * que receba dois números como parâmetros e depois retorne a soma de todos os
	 * valores no intervalo entre os valores recebidos.
	 */
	
	public static int somarValores(int inicio, int fim) {
		int soma = 0;
		for (int i = inicio; i < fim; i++) {
			soma += i;
		}
		return soma;
	}
}
