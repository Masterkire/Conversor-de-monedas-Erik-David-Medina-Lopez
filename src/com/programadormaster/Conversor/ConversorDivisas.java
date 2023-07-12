package com.programadormaster.Conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorDivisas {
	private static double dolarTasa = 0.059;
	private static double wonTasa = 75.73;
	private static double pesoColombianoTasa = 245.78;
	private static double solTasa = 0.21; 
	private static double pesoArgentinoTasa = 15.44;
	private static double euroTasa = 0.053; 
	private static double yenTasa = 8.23;  
	private static double libraTasa = 0.045; 
	
	public static void convertirPesoMexicano() {
		
		String cantidadString = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir:");
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
				"Dolar a Peso(MXN)", 
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

        double resultado = 0;
        String moneda = "";
        String monedaAConvertir="";

		switch (tipoConversion) {
	    case "Peso(MXN) a Dolar":
	    	
	        resultado = cantidad * dolarTasa;
	        moneda = "dólares";
	    
	        break;
	    case "Peso(MXN) a Won":
	    	
	    	resultado = cantidad * wonTasa;
	    	moneda = "wons";
	    	
	        break;
	    case "Peso(MXN) a Peso Colombiano":
	    	
	    	resultado = cantidad * pesoColombianoTasa;
	    	moneda = "pesos colombianos";
	    	
	        break;
	    case "Peso(MXN) a Sol":
	    	
	    	resultado = cantidad * solTasa;
	    	moneda = "soles";
	    	
	        break;
	    case "Peso(MXN) a Peso Argentino":
	    	
	    	resultado = cantidad * pesoArgentinoTasa;
	    	moneda = "pesos argentinos";
	    	
	        break;
	    case "Peso(MXN) a Euro":
	    	
	    	resultado = cantidad * euroTasa;
	    	moneda = "euros";
	    	
	        break;
	    case "Peso(MXN) a Yen Japones":
	    	
	    	resultado = cantidad * yenTasa;
	    	moneda = "yens japoneses";
	    	
	        break;
	    case "Peso(MXN) a Libra Esterlina":
	    	
	    	resultado = cantidad * libraTasa;
	    	moneda = "libras esterlinas";
	   /*--------------------------------------*/
	        break;
	    case "Dolar a Peso(MXN)":
	    	
	        resultado = cantidad / dolarTasa;
	        moneda = "pesos mexicanos";
	        monedaAConvertir=" Dolar";
	    
	        break;
	    case "Won a Peso(MXN)":
	    	
	    	resultado = cantidad / wonTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Won";
	    	
	        break;
	    case "Peso Colombiano a Peso(MXN)":
	    	
	    	resultado = cantidad / pesoColombianoTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Pesos Colombianos";
	    	
	        break;
	    case "Sol a Peso(MXN)":
	    	
	    	resultado = cantidad / solTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Soles";
	    	
	        break;
	    case "Peso Argentino a Peso(MXN)":
	    	
	    	resultado = cantidad / pesoArgentinoTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Pesos Argentinos";
	    	
	        break;
	    case "Euro a Peso(MXN)":
	    	
	    	resultado = cantidad / euroTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Euros";
	    	
	        break;
	    case "Yen Japones a Peso(MXN)":
	    	
	    	resultado = cantidad / yenTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Yens";
	    	
	        break;
	    case "Libra Esterlina a Peso(MXN)":
	    	
	    	resultado = cantidad / libraTasa;
	    	moneda = "pesos mexicanos";
	    	monedaAConvertir=" Libras Esterlinas";
	    	
	        break;
	    default:
	        JOptionPane.showMessageDialog(null, "Tipo de conversión inválido.");
	        System.exit(0);
		}
		
		DecimalFormat formato = new DecimalFormat("#.##");
		String resultadoString = formato.format(resultado);

		if (moneda!="pesos mexicanos") {
			JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos son equivalentes a " +
			        resultadoString + " " + moneda + ".");
		} else if(moneda=="pesos mexicanos") {
			JOptionPane.showMessageDialog(null, cantidad + monedaAConvertir + " son equivalentes a " +
			        resultadoString + " pesos mexicanos.");
		}
		
	}
	

}
