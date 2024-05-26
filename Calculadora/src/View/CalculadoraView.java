package View;

import java.util.Scanner;

public class CalculadoraView {

	private Scanner teclado;

	public CalculadoraView() {
		this.teclado = new Scanner(System.in);
	}

	public int menuDeCalculadora() {
		System.out.println("********** BIENVENIDOS A CALCULADORA CASIO **********\n");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Division");
		System.out.println("4) Multiplicacion");
		System.out.println("5) Raiz");
		System.out.println("6) Modulo");
		System.out.println("7) Exponenciacion");
		System.out.println("8) Salir");
		System.out.print("\nIngrese la operacion que desea: ");
		return teclado.nextInt();
	}

	public double obtenerValor(String mensaje) {
		System.out.print(mensaje);
		return teclado.nextDouble();
	}

	public void mostrarResultado(String operacion, double valor1, double valor2, double resultado) {
		System.out.println("La operación seleccionada es " + operacion + "");
		System.out.println("Los valores ingresados son: " + valor1 + " y " + valor2 + "\n");
		System.out.println("Resultado: " + resultado + "\n");
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public boolean continuar() {
		int salir;
		do {
			System.out.println("¿Desea continuar? ");
			System.out.println("1) Salir ");
			System.out.println("2) Continuar ");
			salir = teclado.nextInt();
			if (salir != 1 && salir != 2)
				System.out.println("Opción inválida");
		} while (salir != 1 && salir != 2);
		return salir == 2;
	}
}
