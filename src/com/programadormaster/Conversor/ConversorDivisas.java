package com.programadormaster.Conversor;

import javax.swing.JOptionPane;

public class ConversorDivisas {
	private double dolarTasa = 0.059;
	private double wonTasa = 75.73;
	private double pesoColombianoTasa = 245.78;
	private double solTasa = 0.21; 
	private double pesoArgentinoTasa = 15.44;
	private double euroTasa = 0.053; 
	private double yenTasa = 8.23;  
	private double libraTasa = 0.045; 
	
	private double resultado = 0;
	private String moneda = "";
	private double cantidad;
	private String message=" pesos mexicanos son equivalentes a ";
	private String message2;
	
	public double getResultado() {
		return resultado;
	}
	
	public String getMoneda() {
		return moneda;
	}
	
	public Double getCantidad() {
		return cantidad;
	}
	
	public String getMensaje() {
		return message;
	}
	
	public String getMensaje2() {
		return message2;
	}
	
	public void convertir(String tipoConversor, double monto) {

		switch (tipoConversor) {
	    case "Peso(MXN) a Dolar":
	    	cantidad=monto;
	        this.resultado = this.cantidad * dolarTasa;
	        this.moneda = "dólares";
	    
	        break;
	    case "Peso(MXN) a Won":
	    	cantidad=monto;
	    	this.resultado = cantidad * wonTasa;
	    	this.moneda = "wons";
	    	
	        break;
	    case "Peso(MXN) a Peso Colombiano":
	    	cantidad=monto;
	    	this.resultado = cantidad * pesoColombianoTasa;
	    	this.moneda = "pesos colombianos";
	    	
	        break;
	    case "Peso(MXN) a Sol":
	    	cantidad=monto;
	    	this.resultado = cantidad * solTasa;
	    	this.moneda = "soles";
	    	
	        break;
	    case "Peso(MXN) a Peso Argentino":
	    	cantidad=monto;
	    	this.resultado = cantidad * pesoArgentinoTasa;
	    	this.moneda = "pesos argentinos";
	    	
	        break;
	    case "Peso(MXN) a Euro":
	    	cantidad=monto;
	    	this.resultado = cantidad * euroTasa;
	    	this.moneda = "euros";
	    	
	        break;
	    case "Peso(MXN) a Yen Japones":
	    	cantidad=monto;
	    	this.resultado = cantidad * yenTasa;
	    	this.moneda = "yens japoneses";
	    	
	        break;
	    case "Peso(MXN) a Libra Esterlina":
	    	cantidad=monto;
	    	this.resultado = cantidad * libraTasa;
	    	this.moneda = "libras esterlinas";
	   /*--------------------------------------*/
	        break;
	    case "Dólar a Peso(MXN)":
	    	cantidad=monto;
	        this.resultado = this.cantidad / dolarTasa;
	        this.moneda = "pesos mexicanos";
	    
	        break;
	    case "Won a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / wonTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    case "Peso Colombiano a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / pesoColombianoTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    case "Sol a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / solTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    case "Peso Argentino a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / pesoArgentinoTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    case "Euro a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / euroTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    case "Yen Japones a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / yenTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    case "Libra Esterlina a Peso(MXN)":
	    	cantidad=monto;
	    	this.resultado = cantidad / libraTasa;
	    	this.moneda = "pesos mexicanos";
	    	
	        break;
	    default:
	        JOptionPane.showMessageDialog(null, "Tipo de conversión inválido.");
	        System.exit(0);
		}
	}
	

}
