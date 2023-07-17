package com.programadormaster.Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorPeso {
	public static void convertirPeso() {
        String[] opciones = {"Miligramos a Gramos", "Gramos a Kilogramos", "Kilogramos a Toneladas",
                "Toneladas a Libras", "Libras a Kilogramos"};
        String tipoConversion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión:",
                "Seleccionar tipo de conversión", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        double cantidad = obtenerCantidad("Ingrese la cantidad a convertir:");

        double resultado = 0;
        String unidadInicial = "";
        String unidadFinal = "";

        switch (tipoConversion) {
            case "Miligramos a Gramos":
                resultado = cantidad / 1000;
                unidadInicial = "miligramos";
                unidadFinal = "gramos";
                break;
            case "Gramos a Kilogramos":
                resultado = cantidad / 1000;
                unidadInicial = "gramos";
                unidadFinal = "kilogramos";
                break;
            case "Kilogramos a Toneladas":
                resultado = cantidad / 1000;
                unidadInicial = "kilogramos";
                unidadFinal = "toneladas";
                break;
            case "Toneladas a Libras":
                resultado = cantidad * 2204.62;
                unidadInicial = "toneladas";
                unidadFinal = "libras";
                break;
            case "Libras a Kilogramos":
                resultado = cantidad / 2.20462;
                unidadInicial = "libras";
                unidadFinal = "kilogramos";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de conversión inválido.");
                System.exit(0);
        }

        DecimalFormat formato = new DecimalFormat("#.###");
        String resultadoFormateado = formato.format(resultado);

        JOptionPane.showMessageDialog(null, cantidad + " " + unidadInicial + " son equivalentes a " +
                resultadoFormateado + " " + unidadFinal + ".");
    }

    private static double obtenerCantidad(String mensaje) {
        double cantidad = 0;
        boolean esValido = false;

        do {
            try {
                String cantidadString = JOptionPane.showInputDialog(null, mensaje);
                cantidad = Double.parseDouble(cantidadString);
                esValido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
            }
        } while (!esValido);

        return cantidad;
    }
}
