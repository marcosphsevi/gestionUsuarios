package gestion_usuario;

import java.util.Scanner;

public class Extras {
	private String concepto;
	private double dinero;	
	
	String getConcepto() {
		return concepto;
	}
	
	void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	double getDinero() {
		return dinero;
	}
	
	void setDinero(String dinero, Scanner sc) {
		this.dinero = comprobacionDecimal(dinero, sc);
	}
	
	void imprimirInformacion () {
		System.out.println("Motivo: " + concepto);
		System.out.printf("Ingreso total: %.2f\n\n", dinero);
	}
	
	private double comprobacionDecimal (String dinero, Scanner sc) {
		double numero = 0;
		while (true) {
			try {
				numero = Double.parseDouble(dinero);
				if (numero <= 0) {
					System.out.println("El ingreso tiene que ser positivo (y distinto a 0), inténtalo otra vez. ");
					dinero = sc.nextLine();
				}else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("La cantidad tiene que ser decimal, inténtalo otra vez.");
				dinero = sc.nextLine();
			}
		}
		return numero;
	}
}
