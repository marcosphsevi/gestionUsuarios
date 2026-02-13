package gestion_usuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Depurar {

	public static boolean depurarDouble(String numerin) { // Para cuando tenga que depurar un double
		try {
			Double.parseDouble(numerin);

			return true;
		} catch (NumberFormatException e) {
			System.out.println("Parametro invalido, evite espacios o caracteres especiales");
			return false;
		}
	}

	public static boolean depurarInt(String numerin) { // Para depurar enteros
		try {
			Integer.parseInt(numerin);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Parametro invalido, evite espacios o caracteres especiales");
			return false;
		}
	}

	public static boolean depurarFecha(String numerin) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate.parse(numerin, formato);
			
			String partes []=numerin.split("/");
			if (Integer.parseInt(partes[2])<= 1950) {
				System.out.println("La fecha no debe ser menor o igual a 1950");
				return false;
			}
			return true;
		} catch (DateTimeParseException e) {
			System.out.println("Fecha invalida");
			return false;
		}

	}
}
