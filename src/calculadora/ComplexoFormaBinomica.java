package calculadora;

public class ComplexoFormaBinomica implements IOperavel<ComplexoFormaBinomica> {
	
	private float real;
	private float imaginario;
	
	
	public ComplexoFormaBinomica(float real, float imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	public ComplexoFormaBinomica() {}
	
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
	public ComplexoFormaBinomica soma(ComplexoFormaBinomica o) {	
		ComplexoFormaBinomica c = new ComplexoFormaBinomica(real + o.real , imaginario + o.imaginario);
		return c ;
	}

	@Override
	public ComplexoFormaBinomica sustracao(ComplexoFormaBinomica o) {
		ComplexoFormaBinomica c = new ComplexoFormaBinomica(real - o.real , imaginario - o.imaginario);
		return c;
	}

	@Override
	public ComplexoFormaBinomica multiplicacao(ComplexoFormaBinomica o) {
		ComplexoFormaBinomica c = new ComplexoFormaBinomica();
		c.real = real * o.real - imaginario * o.imaginario;
		c.imaginario = imaginario * o.real + real * o.imaginario;
		return c;
	}

	@Override
	public ComplexoFormaBinomica divicao(ComplexoFormaBinomica o) {
		ComplexoFormaBinomica c = multiplicacao(o.conjugado());	
		float denominador = o.multiplicacao(o.conjugado()).real;
		c.real /= denominador;
		c.imaginario /= denominador; 
		return c;
	}
	
	public ComplexoFormaBinomica conjugado () {
		ComplexoFormaBinomica c = new ComplexoFormaBinomica(real , -imaginario);
		return c;
	}
	@Override
	public String toString() {
		String strComplexo = String.format("%.2f + %.2fi", real, imaginario);
		return strComplexo;
	}
	

}
