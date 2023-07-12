package com.programadormaster.Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConversorDivisas conversion=new ConversorDivisas();
		String cantidadString = JOptionPane.showInputDialog(null, "Ingrese la cantidad en pesos mexicanos:");
		double cantidad = Double.parseDouble(cantidadString);
		
		String[] opciones = {
				"Peso(MXN) a Dolar", 
				"Peso(MXN) a Won", 
				"Peso(MXN) a Peso Colombiano", 
				"Peso(MXN) a Sol", 
				"Peso(MXN) a Peso Argentino", 
				"Peso(MXN) a Euro", 
				"Peso(MXN) a Yen Japones", 
				"Peso(MXN) a Libra Esterlina",
				"Dólar a Peso(MXN)", 
				"Won a Peso(MXN)", 
				"Peso Colombiano a Peso(MXN)", 
				"Sol a Peso(MXN)", 
				"Peso Argentino a Peso(MXN)", 
				"Euro a Peso(MXN)", 
				"Yen Japones a Peso(MXN)", 
				"Libra Esterlina a Peso(MXN)"
				};
		
		String tipoConversion = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversión:",
		        "Seleccionar tipo de conversión", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		
		conversion.convertir(tipoConversion, cantidad);
		
		conversion.getCantidad();
		conversion.getMensaje();
		conversion.getMensaje2();
		String moneda=conversion.getMoneda();
		double resultado = conversion.getResultado();
		
		DecimalFormat formato = new DecimalFormat("#.##");
		String resultadoString = formato.format(resultado);

		JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son equivalentes a " +
		        resultadoString + " " + moneda + ".");

		
	}

}
