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
		 
		int somatoria = 0;
		for (int i = 1; i <= 100; i++) {
			if (i>0) {
				somatoria+=i;
			}
		}
		System.out.println(somatoria);;
	}

}
