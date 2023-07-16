package com.programadormaster.Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorLongitudes {
	public static void convertirLongitud() {
        String[] opciones = {"Centímetros a Metros", "Metros a Kilómetros", "Metros a Pulgadas",
                "Pulgadas a Metros", "Centímetros a Pulgadas", "Pulgadas a Centímetros",
                "Kilómetros a Pulgadas", "Pulgadas a Kilómetros", "Pies a Metros", "Metros a Pies",
                "Yardas a Metros", "Metros a Yardas"};
        String tipoConversion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión:",
                "Seleccionar tipo de conversión", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        double cantidad = obtenerCantidad("Ingrese la cantidad a convertir:");

        double resultado = 0;
        String unidadInicial = "";
        String unidadFinal = "";

        switch (tipoConversion) {
            case "Centímetros a Metros":
                resultado = cantidad / 100;
                unidadInicial = "centímetros";
                unidadFinal = "metros";
                break;
            case "Metros a Kilómetros":
                resultado = cantidad / 1000;
                unidadInicial = "metros";
                unidadFinal = "kilómetros";
                break;
            case "Metros a Pulgadas":
                resultado = cantidad * 39.37;
                unidadInicial = "metros";
                unidadFinal = "pulgadas";
                break;
            case "Pulgadas a Metros":
                resultado = cantidad / 39.37;
                unidadInicial = "pulgadas";
                unidadFinal = "metros";
                break;
            case "Centímetros a Pulgadas":
                resultado = cantidad / 2.54;
                unidadInicial = "centímetros";
                unidadFinal = "pulgadas";
                break;
            case "Pulgadas a Centímetros":
                resultado = cantidad * 2.54;
                unidadInicial = "pulgadas";
                unidadFinal = "centímetros";
                break;
            case "Kilómetros a Pulgadas":
                resultado = cantidad * 39370.08;
                unidadInicial = "kilómetros";
                unidadFinal = "pulgadas";
                break;
            case "Pulgadas a Kilómetros":
                resultado = cantidad / 39370.08;
                unidadInicial = "pulgadas";
                unidadFinal = "kilómetros";
                break;
            case "Pies a Metros":
                resultado = cantidad * 0.3048;
                unidadInicial = "pies";
                unidadFinal = "metros";
                break;
            case "Metros a Pies":
                resultado = cantidad / 0.3048;
                unidadInicial = "metros";
                unidadFinal = "pies";
                break;
            case "Yardas a Metros":
                resultado = cantidad * 0.9144;
                unidadInicial = "yardas";
                unidadFinal = "metros";
                break;
            case "Metros a Yardas":
                resultado = cantidad / 0.9144;
                unidadInicial = "metros";
                unidadFinal = "yardas";
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
