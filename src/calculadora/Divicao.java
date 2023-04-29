package calculadora;

public class Divicao<T extends IOperavel<T>> extends Operacao<T> {
	public Divicao(T op1, T op2) {
		super(op1, op2); 
	}
	@Override
	public T calcular() {
		resultado = operando1.divicao(operando2);
		return resultado;
	}

}
