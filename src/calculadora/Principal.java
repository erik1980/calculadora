package calculadora;

public class Principal {
	public static void main(String[] args) {
		Operacao<IntWrapper> soma = new Soma<>(new IntWrapper(2), new IntWrapper(3));		
		Calculadora calculadora = new Calculadora ();
		System.out.println(calculadora.realizarOperacao(soma)); 
		
		Operacao<Complexo> somaComplexo = new Soma<>(new Complexo(3, 6), new Complexo(7, 11));
		Operacao<Complexo> multComplexo = new Multiplicacao<>(new Complexo(3, 6), new Complexo(7, 11));
		Operacao<Complexo> divComplexo = new Divicao<>(new Complexo(3, 6), new Complexo(7, 11));

		System.out.println(calculadora.realizarOperacao(somaComplexo));
		System.out.println(calculadora.realizarOperacao(multComplexo));
		System.out.println(calculadora.realizarOperacao(divComplexo));

	}
}
