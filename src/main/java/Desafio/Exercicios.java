package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {

	
	/*1. Criar um método para calcular e retornar a área de um triangulo, esse método deve receber dois valores inteiros referente a base e altura do triangulo.
Dica: Area = Base X Altura / 2*/
	
	public double calculaAreaTriangulo(double base, double altura) {
		double area = (base * altura)/2;
		
		return area;
	}
	
	/*2. Criar um método que receberá 3 valores inteiros e deverá retornar o maior deles.
Dica: Será necessário utilizar If com duas condições combinadas.*/
	
	public int retornaMaior(int v1, int v2, int v3) {
		int maiorValor;
		
		if (v1 >= v2 && v1 >= v3) {
			maiorValor = v1;
			
		} else if(v2 >= v1 && v2 > v3) {
			maiorValor = v2;
		} else maiorValor = v3; 
		return maiorValor;
	}
	
	/*3. Criar um método que deverá retornar a soma dos números inteiros positivos do intervalo de um a cem.

	Dica:	Estrutura do For:
	for(contador; condição; incremento){
	}*/
	
	/*ESTÁ NA CLASSE DE TESTES*/
	
}
