package Principal;

import Model.Calculadora;
import View.CalculadoraView;
import Controller.CalculadoraController;

public class TestCalculadoraMVC {
    public static void main(String[] args) {
        Calculadora modelo = new Calculadora(0, 0);
        CalculadoraView vista = new CalculadoraView();
        CalculadoraController controlador = new CalculadoraController(modelo, vista);
        controlador.iniciar();
    }
}
