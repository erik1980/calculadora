package calculadora;

public class Complexo implements IOperavel<Complexo> {
	
	private float real;
	private float imaginario;
	
	
	public Complexo(float real, float imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public Complexo() {}
	
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public double getImaginario() {
		return imaginario;
	}
	public void setImaginario(float imaginario) {
		this.imaginario = imaginario;
	}

	@Override
	public Complexo soma(Complexo o) {	
		Complexo c = new Complexo(real + o.real , imaginario + o.imaginario);
		return c ;
	}

	@Override
	public Complexo sustracao(Complexo o) {
		Complexo c = new Complexo(real - o.real , imaginario - o.imaginario);
		return c;
	}

	@Override
	public Complexo multiplicacao(Complexo o) {
		Complexo c = new Complexo();
		c.real = real * o.real - imaginario * o.imaginario;
		c.imaginario = imaginario * o.real + real * o.imaginario;
		return c;
	}

	@Override
	public Complexo divicao(Complexo o) {
		Complexo c = multiplicacao(o.conjugado());	
		float denominador = o.multiplicacao(o.conjugado()).real;
		c.real /= denominador;
		c.imaginario /= denominador; 
		return c;
	}
	
	public Complexo conjugado () {
		Complexo c = new Complexo(real , -imaginario);
		return c;
	}
	@Override
	public String toString() {
		String strComplexo = String.format("%.2f + %.2fi", real, imaginario);
		return strComplexo;
	}
	

}
