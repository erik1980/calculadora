package calculadora;

public class NumeroComplexoFormaBinomica implements IOperavel<NumeroComplexoFormaBinomica> {
	
	private float real;
	private float imaginario;
	
	
	public NumeroComplexoFormaBinomica(float real, float imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public NumeroComplexoFormaBinomica() {}
	
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
	public NumeroComplexoFormaBinomica soma(NumeroComplexoFormaBinomica o) {	
		NumeroComplexoFormaBinomica c = new NumeroComplexoFormaBinomica(real + o.real , imaginario + o.imaginario);
		return c ;
	}

	@Override
	public NumeroComplexoFormaBinomica sustracao(NumeroComplexoFormaBinomica o) {
		NumeroComplexoFormaBinomica c = new NumeroComplexoFormaBinomica(real - o.real , imaginario - o.imaginario);
		return c;
	}

	@Override
	public NumeroComplexoFormaBinomica multiplicacao(NumeroComplexoFormaBinomica o) {
		NumeroComplexoFormaBinomica c = new NumeroComplexoFormaBinomica();
		c.real = real * o.real - imaginario * o.imaginario;
		c.imaginario = imaginario * o.real + real * o.imaginario;
		return c;
	}

	@Override
	public NumeroComplexoFormaBinomica divicao(NumeroComplexoFormaBinomica o) {
		NumeroComplexoFormaBinomica c = multiplicacao(o.conjugado());	
		float denominador = o.multiplicacao(o.conjugado()).real;
		c.real /= denominador;
		c.imaginario /= denominador; 
		return c;
	}
	
	public NumeroComplexoFormaBinomica conjugado () {
		NumeroComplexoFormaBinomica c = new NumeroComplexoFormaBinomica(real , -imaginario);
		return c;
	}
	@Override
	public String toString() {
		String strComplexo = String.format("%.2f + %.2fi", real, imaginario);
		return strComplexo;
	}
	

}
