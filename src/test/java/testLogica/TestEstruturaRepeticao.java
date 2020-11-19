package testLogica;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Test;

import logica.EstruturaRepeticao;

public class TestEstruturaRepeticao {
	
	EstruturaRepeticao estruturaRepeticao = new EstruturaRepeticao();
	
	@Test
	public void testTabuada() {
		List<Integer> resultado = estruturaRepeticao.tabuada(5);
		
		List<Integer> esperado = new ArrayList<Integer>();
		esperado.add(5);
		esperado.add(10);
		esperado.add(15);
		esperado.add(20);
		esperado.add(25);
		esperado.add(30);
		esperado.add(35);
		esperado.add(40);
		esperado.add(45);
		esperado.add(50);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testTabuadaDecrescente() {
		
		int x = 5;
		int a = 2;
		int b = 8;
		
		if(b<a) {
			System.out.println("O valor B deve ser maior que o valor A");
			return;
		}

			for(int i = b; i > a; i--) {
				System.out.println(x + " x " + i + " = " + x*i);
			}
		
	}
	
	public void megaSena() {
		//1 2 3 4 5 6
		int x = 60;
		for (int n1 = 1; n1 <= x; n1++) {
			for (int n2 = 1; n2 <= x; n2++) {
				for (int n3 = 1; n3 <= x; n3++) {
					for (int n4 = 1; n4 <= x; n4++) {
						for (int n5 = 1; n5 <= x; n5++) {
							for (int n6 = 1; n6 <= x; n6++) {
								
								
								LinkedHashMap<Integer, Integer> map = new LinkedHashMap();
								
								map.put(n1, 0);
								map.put(n2, 0);
								map.put(n3, 0);
								map.put(n4, 0);
								map.put(n5, 0);
								map.put(n6, 0);
								
								if(map.size() == 6) {
									System.out.println(n1+"."+n2+"."+n3+"."+n4+"."+n5+"."+n6);
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	
	@Test
	public void clima() {
		//clima = ensolarado, chovendo, nublado, nevando;
		
		String situacao = "";
		String tempo = "chovendo";
		
		switch (tempo) {
		case "ensolarado":
			System.out.println("Sai de csa com mascara");
			break;
		case "chovendo":
			System.out.println("Sai de guardachuva");
			break;
		case "nublado":
			System.out.println("Sai de casaco");
			break;
		case "nevando":
			System.out.println("fica em casa");
		default:
			break;
		}
		
		
		
	}
	
	@Test
	public void climaComArtesMisticas() {
		String situacao = "";
		String tempo = "nevando";
		
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("ensolarado", "sai de casa com mascara");
		map.put("chovendo", "casaco");
		map.put("nublado", "casaquinho");
		map.put("nevando", "nao sai de casa");
		
		System.out.println(map.get(tempo));
	}
	
	

}
