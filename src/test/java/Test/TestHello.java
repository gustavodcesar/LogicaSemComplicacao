package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hello.HelloWorld;

public class TestHello {

	@Test
	public void RealizaTestHello() {
		
		HelloWorld hw = new HelloWorld("HelloWorld");
		
		String texto = "teste";
		
		texto = hw.getHelloWorld();
		
		//lanca erro com throw new Exception("");
	}
	
	@Test
	public void RealizaTestHello2() {
		HelloWorld helloWorld = new HelloWorld("HelloWorld");
		String texto = "teste";
		texto = helloWorld.getHelloWorld();
		assertEquals("Hello World", texto);
	}
	
	@Test
	public void TesteComparacao() {
		String texto = HelloWorld.getTexto();
		assertEquals("Teste", texto);
	}
	
}
