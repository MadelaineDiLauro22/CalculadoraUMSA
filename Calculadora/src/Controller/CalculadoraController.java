package Controller;

import Model.Calculadora;
import View.CalculadoraView;

public class CalculadoraController {
	private Calculadora modelo;
	private CalculadoraView vista;

	public CalculadoraController(Calculadora modelo, CalculadoraView vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	public void iniciar() {
		boolean continuar;
		do {
			int opcion = vista.menuDeCalculadora();

			switch (opcion) {
			case 1:
				realizarOperacion("suma");
				break;
			case 2:
				realizarOperacion("resta");
				break;
			case 3:
				realizarOperacion("division");
				break;
			case 4:
				realizarOperacion("multiplicacion");
				break;
			case 5:
				realizarOperacion("raiz");
				break;
			case 6:
				realizarOperacion("modulo");
				break;
			case 7:
				realizarOperacion("exponenciacion");
				break;
			case 8:
				vista.mostrarMensaje("Gracias por usar Calculadora Casio. Vuelva pronto.");
				return;
			default:
				vista.mostrarMensaje("Opción incorrecta, por favor ingrese una opción válida.");
			}
			continuar = vista.continuar();
		} while (continuar);
		vista.mostrarMensaje("Gracias por usar Calculadora Casio. Vuelva pronto.");
	}

	private void realizarOperacion(String operacion) {
		double valor1 = vista.obtenerValor("Ingrese el primer valor: \n");
		double valor2 = vista.obtenerValor("\nIngrese el segundo valor:\n ");
		double resultado = 0.0;

		switch (operacion) {
		case "suma":
			resultado = modelo.sumar(valor1, valor2);
			break;
		case "resta":
			resultado = modelo.restar(valor1, valor2);
			break;
		case "division":
			if (valor2 != 0) {
				resultado = modelo.division(valor1, valor2);
			} else {
				vista.mostrarMensaje("Es imposible realizar la división");
				return;
			}
			break;
		case "multiplicacion":
			resultado = modelo.multiplicacion(valor1, valor2);
			break;
		case "raiz":
			resultado = modelo.radicacion(valor1, valor2);
			break;
		case "modulo":
			resultado = modelo.modulo(valor1, valor2);
			break;
		case "exponenciacion":
			resultado = modelo.potencia(valor1, valor2);
			break;
		}
		vista.mostrarResultado(operacion, valor1, valor2, resultado);
	}
}
