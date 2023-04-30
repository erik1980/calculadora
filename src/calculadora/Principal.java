package calculadora;

public class Principal {
	public static void main(String[] args) {
		Operacao<IntWrapper> soma = new Soma<>(new IntWrapper(2), new IntWrapper(3));		
		Calculadora calculadora = new Calculadora ();
		System.out.println(calculadora.realizarOperacao(soma)); 
		
		Operacao<ComplexoFormaBinomica> somaComplexo = new Soma<>(new ComplexoFormaBinomica(3, 6), new ComplexoFormaBinomica(7, 11));
		Operacao<ComplexoFormaBinomica> multComplexo = new Multiplicacao<>(new ComplexoFormaBinomica(3, 6), new ComplexoFormaBinomica(7, 11));
		Operacao<ComplexoFormaBinomica> divComplexo = new Divicao<>(new ComplexoFormaBinomica(3, 6), new ComplexoFormaBinomica(7, 11));

		System.out.println(calculadora.realizarOperacao(somaComplexo));
		System.out.println(calculadora.realizarOperacao(multComplexo));
		System.out.println(calculadora.realizarOperacao(divComplexo));

	}
}
