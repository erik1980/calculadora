package calculadora;

public class Calculadora {
	public  <T extends IOperavel<T>> T realizarOperacao(Operacao<T> op) {
		return op.calcular();
	}
}
