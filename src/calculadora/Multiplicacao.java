package calculadora;

public class Multiplicacao <T extends IOperavel<T>> extends Operacao<T> {

	public Multiplicacao(T op1, T op2) {
		super(op1, op2);
	}
	@Override
	public T calcular() {
		resultado = operando1.multiplicacao(operando2);
		return resultado;
	}

}
