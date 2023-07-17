package com.programadormaster.Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorGrados {
	public static void convertirTemperatura() {
        String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius", "Celsius a Kelvin",
                "Kelvin a Celsius", "Fahrenheit a Kelvin", "Kelvin a Fahrenheit"};
        String tipoConversion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión:",
                "Seleccionar tipo de conversión", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        double temperatura = obtenerCantidad("Ingrese la temperatura a convertir:");

        double resultado = 0;
        String unidadInicial = "";
        String unidadFinal = "";

        switch (tipoConversion) {
            case "Celsius a Fahrenheit":
                resultado = (temperatura * 9/5) + 32;
                unidadInicial = "grados Celsius";
                unidadFinal = "grados Fahrenheit";
                break;
            case "Fahrenheit a Celsius":
                resultado = (temperatura - 32) * 5/9;
                unidadInicial = "grados Fahrenheit";
                unidadFinal = "grados Celsius";
                break;
            case "Celsius a Kelvin":
                resultado = temperatura + 273.15;
                unidadInicial = "grados Celsius";
                unidadFinal = "grados Kelvin";
                break;
            case "Kelvin a Celsius":
                resultado = temperatura - 273.15;
                unidadInicial = "grados Kelvin";
                unidadFinal = "grados Celsius";
                break;
            case "Fahrenheit a Kelvin":
                resultado = (temperatura + 459.67) * 5/9;
                unidadInicial = "grados Fahrenheit";
                unidadFinal = "grados Kelvin";
                break;
            case "Kelvin a Fahrenheit":
                resultado = (temperatura * 9/5) - 459.67;
                unidadInicial = "grados Kelvin";
                unidadFinal = "grados Fahrenheit";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de conversión inválido.");
                System.exit(0);
        }

        DecimalFormat formato = new DecimalFormat("#.###");
        String resultadoFormateado = formato.format(resultado);

        JOptionPane.showMessageDialog(null, temperatura + " " + unidadInicial + " son equivalentes a " +
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
