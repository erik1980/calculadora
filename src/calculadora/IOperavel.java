package calculadora;

public interface IOperavel<T>{
	T soma(T o);
	T sustracao(T o );
	T multiplicacao(T o);
	T divicao(T o);
}
