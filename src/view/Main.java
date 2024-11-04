package view;

import java.util.Scanner;

import model.Calculadora;
import model.CalculadoraAluno;
import model.Potenciador;
import model.SuperSomador;

public class Main {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		CalculadoraAluno ca = new CalculadoraAluno();
		SuperSomador ss = new SuperSomador();
		Potenciador p = new Potenciador();
		Scanner scan = new Scanner(System.in);
		
		// exercicio 1 refatoramento mostrar calcular. 
		//System.out.println("Soma: " + c.somar(scan.nextInt(), scan.nextInt())); recebe e mostra a soma
		
		System.out.println(" Soma: " + c.somar(570, 52));
		// c.somar(0, 0);
		
		// exercicio 2 refatoramento mostrar calcular Media
		System.out.println(" Aluno média: " + ca.calcularMedia(7.5, 10));
		
		// exercicio 3 refatoramento mostrar maior de tres numeros.
		System.out.println(" Maior número é " + c.maior(15, 56, 65));
		 
		// exercicio 4 refatoramento mostrar somarValores()
		System.out.println(" Soma dos valores entre números digitados é " + ss.somarValores(5, 15));
		
		// exercicio 5 refatoramento exponenciação
		System.out.println(" Exponenciação dos termos são " + p.potencia(8, 5));
		
		// exercicio 6 refatoramento situação do aluno
		System.out.println(" Aluno está " + ca.verificarSituacao(8));
		
		System.out.println(" Aluno está " + ca.verificarSituacao(4.5));
		
		System.out.println(" Aluno está " + ca.verificarSituacao(2));
	}
	
	
}
