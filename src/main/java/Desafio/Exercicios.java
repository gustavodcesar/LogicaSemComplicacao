package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {

	
	/*1. Criar um m�todo para calcular e retornar a �rea de um triangulo, esse m�todo deve receber dois valores inteiros referente a base e altura do triangulo.
Dica: Area = Base X Altura / 2*/
	
	public double calculaAreaTriangulo(double base, double altura) {
		double area = (base * altura)/2;
		
		return area;
	}
	
	/*2. Criar um m�todo que receber� 3 valores inteiros e dever� retornar o maior deles.
Dica: Ser� necess�rio utilizar If com duas condi��es combinadas.*/
	
	public int retornaMaior(int v1, int v2, int v3) {
		int maiorValor;
		
		if (v1 >= v2 && v1 >= v3) {
			maiorValor = v1;
			
		} else if(v2 >= v1 && v2 > v3) {
			maiorValor = v2;
		} else maiorValor = v3; 
		return maiorValor;
	}
	
	/*3. Criar um m�todo que dever� retornar a soma dos n�meros inteiros positivos do intervalo de um a cem.

	Dica:	Estrutura do For:
	for(contador; condi��o; incremento){
	}*/
	
	/*EST� NA CLASSE DE TESTES*/
	
}
