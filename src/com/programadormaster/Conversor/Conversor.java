package com.programadormaster.Conversor;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuar = true;
		
		while(continuar) {
			
			String[] opciones = {"Conversor de Monedas", "Conversor de Longitudes"}; // Agrega más opciones según los conversores que tengas
			String tipoConversor = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de conversor:",
					"Seleccionar tipo de conversor", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
			
			// Modifica el título de la ventana según el tipo de conversor seleccionado
			String tituloVentana = "Conversor de Monedas"; // Título por defecto
			
			switch (tipoConversor) {
			case "Conversor de Monedas":
				tituloVentana = "Conversor de Monedas";
				ConversorDivisas.convertirPesoMexicano();
				break;
				case "Conversor de Longitudes":
                tituloVentana = "Conversor de Longitudes";
                ConversorLongitudes.convertirLongitud();
                break;
			default:
				JOptionPane.showMessageDialog(null, "Tipo de conversor inválido.");
				System.exit(0);
			}
			
			int opcion = JOptionPane.showOptionDialog(null, "Gracias por utilizar el " + tituloVentana + ". ¿Desea Continuar?",
					"Finalizar programa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,
					new String[] {"Continuar", "Cerrar"}, "Continuar");
			
			if (opcion == JOptionPane.YES_OPTION) {
				continuar=true;
			} else {
				continuar = false;
			}
		}
		
        JOptionPane.showMessageDialog(null,"Programa Finalizado.");
	}
	

}
