package model;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Calculadora {

	/*
	 * 1) Refatore o método somar() da classe Calculadora para adicionar um retorno
	 * do tipo int, de forma que o método realize a soma dos dois números e retorne
	 * o resultado calculado.
	 */
	
	public int somar(int p, int s) {
		int soma = p + s;

		return soma;
	}

	/*3) Crie o método maior() na classe Calculadora para aceitar três números como parâmetros e retornar o maior deles.*/
	
	public int maior(int p, int s, int t) {
		return Math.max(p, Math.max(s, t));
	}
}



/* não funciona o retorn solicita os parametros.
public int maior(int p, int s, int t) {
	if( p > s && p > t) {
		System.out.println("Número " + p +" e maior que " + s + " e " + t);
	}else if(s > t && s > p){
		System.out.println("Número " + s +" e maior que " + p + " e " + t);
	}else if(t > p && t > s){
		System.out.println("Número " + t +" e maior que " + p + " e " + s);
	}else {
		System.out.println("Números igual!");
	}
	return maior();
}*/