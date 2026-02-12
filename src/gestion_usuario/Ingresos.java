package gestion_usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingresos {
	private double porcentajeIrpf;
	private double ingresosNomina;
	private double ingresosWallapop;
	private double ingresosHerencias;
	private ArrayList <Extras> ventasWallapop;
	private ArrayList <Extras> herencias;
	
	public Ingresos (double nominaBruto) {
		porcentajeIrpf = 0.21;
		ingresosNomina = nominaBruto - (nominaBruto * porcentajeIrpf);
		ventasWallapop = new ArrayList<>();
		herencias = new ArrayList<>();
	}
	
	
	public void rellenarWallapop (Scanner sc) {
		System.out.println("Introduce el concepto de la venta de Wallapop (Escribe \"salir\" para salir):");
		while (true) {
			Extras ventaWallapop = new Extras();			
			ventaWallapop.setConcepto(sc.nextLine());
			if (!ventaWallapop.getConcepto().equalsIgnoreCase("SALIR")) {
				System.out.println("Introduce el ingreso generado por la venta:");
				ventaWallapop.setDinero(sc.nextLine(), sc);
				ventasWallapop.add(ventaWallapop);
				System.out.println("Introduce otro concepto de venta de Wallapop (Escribe \"salir\" para terminar):");
			}else {
				break;
			}
		}
	}
	
	public void rellenarHerencia (Scanner sc) {
		System.out.println("Introduce el motivo de la herencia (Escribe \"salir\" para salir):");
		while (true) {
			Extras herencia = new Extras();
			herencia.setConcepto(sc.nextLine());
			if (!herencia.getConcepto().equalsIgnoreCase("SALIR")) {
				System.out.println("Introduce el ingreso: ");
				herencia.setDinero(sc.nextLine(), sc);
				herencias.add(herencia);
				System.out.println("Introduce otro motivo de herencia (Escribe \"salir\" para terminar):");
			}else {
				break;
			}
		}
	}
	
	public void mostrarExtras (ArrayList <Extras> extra) {
		for (Extras e : extra) {
            e.imprimirInformacion();
        }
	}
	
	public void totalGeneradoExtras () {
		ingresosWallapop = 0;
		ingresosHerencias = 0;
		for (Extras e : ventasWallapop) {
            ingresosWallapop += e.getDinero();
        }
		for (Extras e : herencias) {
            ingresosHerencias += e.getDinero();
        }
	}
	
	public void imprimirInformacion () {
		System.out.println("\nTotal ingresos:");
		System.out.println("Ventas wallapop:\n");
		mostrarExtras(ventasWallapop);
		System.out.println("Herencias:\n");
		mostrarExtras(herencias);
		totalGeneradoExtras();
		System.out.println("RESUMEN INGRESOS");
		System.out.println("\nTotal ingresos nómina (-21% IRPF): " + ingresosNomina);
		System.out.println("Total ingresos ventas Wallapop: " + ingresosWallapop);
		System.out.println("Total ingresos herencias: " + ingresosHerencias);
		System.out.println("Total de ingresos generados: " + (ingresosWallapop + ingresosHerencias + ingresosNomina));
	}
}
