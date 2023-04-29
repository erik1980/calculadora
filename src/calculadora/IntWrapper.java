package calculadora;

public class IntWrapper implements IOperavel<IntWrapper> {
	
	private Integer valor;	
	
	public IntWrapper(Integer valor) {
		this.valor = valor;
	}

	@Override
	public IntWrapper soma(IntWrapper o) {
		// TODO Auto-generated method stub
		return new IntWrapper(valor + o.valor);
	}

	@Override
	public IntWrapper sustracao(IntWrapper o) {
		// TODO Auto-generated method stub
		return new IntWrapper(valor - o.valor);
	}

	@Override
	public IntWrapper divicao(IntWrapper o) {
		// TODO Auto-generated method stub
		return new IntWrapper(valor / o.valor);
	}

	@Override
	public IntWrapper multiplicacao(IntWrapper o) {
		// TODO Auto-generated method stub
		return new IntWrapper(valor * o.valor);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return valor.toString();
	}
}
