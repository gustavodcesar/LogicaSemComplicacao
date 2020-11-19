package testLogica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import logica.OperacoesAritmeticas;

public class testOperacoesAritimeticas {

	OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
	int area;
	
	@Test
	public void testAreaRetangulo() {
		int area = opAritmeticas.calculoAreaRetangulo(5, 10);
		
		assertEquals(50, area);
	}
	
	//TDD
	@Test
	public void testAreaQuadrado() {
		int area = opAritmeticas.calculoAreaQuadrado(10);
		
		assertEquals(100, area);
	}
	
	//TDD
	@Test
	public void testCotacaoDolar() {
		
		double reais = opAritmeticas.calculoDolarReais(5.50, 10);
		
		assertEquals(55.00, reais, 0);
	}
	
	@Test
	public void testMediaAritmetica() {
		double media = this.opAritmeticas.calculoMediaAritmetica(5, 7, 4, 8);
		
		assertEquals(6, media, 0);
	}
	
	@Test
	public void testExponencial() {
		int exp = opAritmeticas.calculoExponencial(2,2);
		
		assertEquals(4, exp);
		
	}
	
	@Test 
	public void testTroco() {
		int troco = this.opAritmeticas.calculoTroco(1,2,3,4,5,15);
		assertEquals(0,troco);
	}
	
	@Test
	public void testMaiorNumero() {
		String mensagem1 = this.opAritmeticas.verificarMaiorNumero(2, 3);
		assertEquals(mensagem1, "o maior numero é "+3);
		String mensagem2 = this.opAritmeticas.verificarMaiorNumero(3, 2);
		assertEquals(mensagem2, "o maior numero é "+3);
		String mensagem3 = this.opAritmeticas.verificarMaiorNumero(2, 2);
		assertEquals(mensagem3, "Numeros Iguais");
	}

	@Test
	public void testTerreno() {
		String mensagem = this.opAritmeticas.verificaTerreno(30, 4);
		assertEquals("Terreno grande", mensagem);
		String mensagem2 = this.opAritmeticas.verificaTerreno(30, 2);
		assertEquals("Terreno pequeno", mensagem2);
	}
	
	@Test
	public void testImc() {
		String mensagem = this.opAritmeticas.imc(75, 1.7, "M");
		assertEquals("Acima do Peso", mensagem);
		
		String mensagem2 = this.opAritmeticas.imc(40, 1.7, "M");
		assertEquals("Abaixo do peso", mensagem2);
		
		String mensagem3 = this.opAritmeticas.imc(70, 1.7, "M");
		assertEquals("Peso ideal", mensagem3);
		
		String mensagem4 = this.opAritmeticas.imc(75, 1.7, "F");
		assertEquals("Acima do Peso", mensagem4);
		
		String mensagem5 = this.opAritmeticas.imc(30, 1.7, "F");
		assertEquals("Abaixo do peso", mensagem5);
		
		String mensagem6 = this.opAritmeticas.imc(60, 1.7, "F");
		assertEquals("Peso ideal", mensagem6);
	}
}

	
