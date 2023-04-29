package calculadora;

public abstract class Operacao<T extends IOperavel<T>> {
	protected T operando1;
	protected T operando2;
	protected T resultado;
	
	public Operacao(T operando1, T operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public abstract T calcular();

}
