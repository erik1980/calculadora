package calculadora;

public class Soma <T extends IOperavel<T>> extends Operacao<T> {	
	
	public Soma(T op1, T op2) {
		super(op1, op2);
	}
	@Override
	public T calcular() {
		// TODO Auto-generated method stub
		 resultado = operando1.soma(operando2);
		return resultado;
	}

}
