package calculadora;

public class Principal {
	public static void main(String[] args) {
		Operacao<IntWrapper> soma = new Soma<>(new IntWrapper(2), new IntWrapper(3));		
		Calculadora calculadora = new Calculadora ();
		System.out.println(calculadora.realizarOperacao(soma)); 
		
		Operacao<NumeroComplexoFormaBinomica> somaComplexo = new Soma<>(new NumeroComplexoFormaBinomica(3, 6), new NumeroComplexoFormaBinomica(7, 11));
		Operacao<NumeroComplexoFormaBinomica> multComplexo = new Multiplicacao<>(new NumeroComplexoFormaBinomica(3, 6), new NumeroComplexoFormaBinomica(7, 11));
		Operacao<NumeroComplexoFormaBinomica> divComplexo = new Divicao<>(new NumeroComplexoFormaBinomica(3, 6), new NumeroComplexoFormaBinomica(7, 11));

		System.out.println(calculadora.realizarOperacao(somaComplexo));
		System.out.println(calculadora.realizarOperacao(multComplexo));
		System.out.println(calculadora.realizarOperacao(divComplexo));

	}
}
