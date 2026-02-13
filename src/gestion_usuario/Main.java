package gestion_usuario;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String opcion;
		ArrayList<Viajes> ListaViajes = new ArrayList<>();
		Scanner leer = new Scanner(System.in);

		String fecha;
		String coste;
		String destino;

		do {
			System.out.println("¿Has realizado algun viaje? si/no");
			opcion = leer.nextLine();
		} while (!opcion.equalsIgnoreCase("si") && !opcion.equalsIgnoreCase("no"));
		opcion = opcion.trim();

		if (opcion.equalsIgnoreCase("si")) {
			do {

				System.out.println("======= Viajes=======");

				System.out.print("Destino: ");
				destino = leer.nextLine();

				do {
					System.out.print("Fecha (formato dd/MM/aaaa): ");
					fecha = leer.nextLine();
				} while (!Depurar.depurarFecha(fecha));

				do {
					do {
						System.out.print("Coste: ");
						coste = leer.nextLine();
					} while (!Depurar.depurarDouble(coste));
				} while (Double.parseDouble(coste) <= 0);

				Viajes v = new Viajes(destino, fecha, Double.parseDouble(coste));
				ListaViajes.add(v);

				System.out.println("Introduzca \"1\" para salir, cualquier otro parametro para continuar: ");
				opcion = leer.nextLine();
			} while (!opcion.equals("1"));

			for (Viajes e : ListaViajes) {
				System.out.println( e.toString());
			}

		}

		leer.close();
	}

}
