package model;

public class CalculadoraAluno {

	/*
	 * 2) Crie uma classe CalculadoraAluno com um método calcularMedia() que receba
	 * as duas notas de um aluno como parâmetros e retorne a sua média.
	 */

	public double calcularMedia(double notaUm, double notaDois) {
		double media = (notaUm + notaDois) / 2;

		return media;
	}

	/*
	 * 6) Melhore o método calcularMedia() da classe CalculadoraAluno criando além
	 * da função calcularMedia() uma outra função chamada verificarSituacao() que, a
	 * partir da média, retorne se o aluno está APROVADO, em RECUPERAÇÃO ou
	 * REPROVADO.
	 */

	public String verificarSituacao(double media) {
		if (media >= 7.0) {
			return "Aprovado";
		} else if (media >= 5.0) {
			return "Recuperação";
		} else
			return "Reprovado";
	}
}
