package testDesafios;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Desafio.Exercicios;

public class testExercicios {
	
	Exercicios exerc = new Exercicios();
	
	@Test
	public void testCalculoAreaTriangulo() {
		double area = exerc.calculaAreaTriangulo(3, 5);
		
		assertEquals(7, area,0.5);
	}
	
	
	@Test
	public void testMaiorValor() {
		int maiorValor = exerc.retornaMaior(3, 14, 10);
		System.out.println(maiorValor);
		assertEquals(14, maiorValor);
	}
	
	@Test
	public void somaPositivosUmACem() {
		List<Integer> Positivos = new ArrayList<Integer>(); 
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				Positivos.add(i);
			}
		}
		System.out.println(Positivos);;
	}

}
