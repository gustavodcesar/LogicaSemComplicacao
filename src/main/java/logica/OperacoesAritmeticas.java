package logica;

public class OperacoesAritmeticas {

	
	public int calculoAreaRetangulo(int base, int altura){
		int area;
		return area = base * altura;
	}

	public int calculoAreaQuadrado(int aresta) {
		int area;
		
		area = aresta * aresta;
		
		return area;
	}

	public double calculoDolarReais(double cotacao, int qrDolar) {
		
		double valor = cotacao * qrDolar;
		return valor;
	}

	
	// Calcular e exibir a media aritmetica de quatro valores quaisquer que serão digitados
	public double calculoMediaAritmetica ( double v1, double v2, double v3, double v4) {
		double media = (v1 + v2 + v3 + v4)/4;
				return media;
	}
	
	public int calculoExponencial(int a, int b) {
		int exp = (int) Math.pow(a, b);
		return exp;
	}
	
	public int calculoTroco(int v1,int v2,int v3,int v4,int v5, int pagamento) {
		int troco = pagamento - (v1+v2+v3+v4+v5);
				return troco;
	}
	
	public String verificarMaiorNumero(int a,int b) {
		if(a > b) return "o maior numero é "+a;
		else if(b > a) return "o maior numero é "+b;
		else  return "Numeros Iguais";
	}
	
	public String verificaTerreno(int base, int altura) {
		int areaRetangulo = base * altura;
		if(areaRetangulo>100) {
			return "Terreno grande";
		}
		else return "Terreno pequeno";
	}
	
	public String imc(int peso, double altura, String sexo) {
		double imc=peso/(altura*altura);
		if(sexo.equals("F"))
			if(imc < 19)
				return "Abaixo do peso";
			else if(imc >= 19 && imc < 24)
				return "Peso ideal";
			else return "Acima do Peso";
		else
			if(imc < 20)
				return "Abaixo do peso";
			else if(imc >= 20 && imc < 25)
				return "Peso ideal";
			else return "Acima do Peso";
			
	}
	
	
	
	
	
	
}
