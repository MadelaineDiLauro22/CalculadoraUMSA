package Model;

public class Calculadora {

	// Atributos
	private double valor1 = 0;
	private double valor2 = 0;
	private double resultado = 0.0;

	// Constructor
	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	// Métodos
	public double sumar(double valor1, double valor2) {
		return valor1 + valor2;
	}

	public double restar(double valor1, double valor2) {
		return valor1 - valor2;
	}

	public double multiplicacion(double valor1, double valor2) {
		return valor1 * valor2;
	}

	public double division(double valor1, double valor2) {
		if (valor2 != 0.0) {
			return valor1 / valor2;
		}
		return Double.NaN; // Indica que la division por cero no es posible  de realizar
		
	}

	public double potencia(double valor1, double valor2) {
		return Math.pow(valor1, valor2);
	}

	public double radicacion(double valor1, double valor2) {
		return Math.pow(valor1, 1.0 / valor2);
	}

	public double modulo(double valor1, double valor2) {
		return valor1 % valor2;
	}
}