package gestion_usuario;

import java.util.*;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Crear usuario
        System.out.println("CREACIÓN DE USUARIO");
        System.out.print("Escribe el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Escribe el email: ");
        String email = sc.nextLine();

        System.out.print("Introduce la nómina bruta: ");
        double nomina = sc.nextDouble();
        sc.nextLine();

        usuario u = new usuario(nombre, email, nomina);

        System.out.println("\nUsuario creado:");
        System.out.println(u);

        // Preguntar si quiere editar los datos del usuario
        System.out.println("¿Quieres editar el usuario? (Si/No)");
        String opcion = sc.nextLine().trim().toUpperCase();

        if (opcion.equals("Si")) {
            System.out.println("EDITAR USUARIO");

            System.out.print("Nuevo nombre: ");
            String nuevoNombre = sc.nextLine();
            if (!nuevoNombre.isEmpty()) {
                u.setNombre(nuevoNombre);
            }

            System.out.print("Nuevo email: ");
            String nuevoEmail = sc.nextLine();
            if (!nuevoEmail.isEmpty()) {
                u.setEmail(nuevoEmail);
            }

            System.out.print("Nueva nómina bruta: ");
            double nuevaNomina = sc.nextDouble();
            if (nuevaNomina >= 0) {
                u.setNominaBruta(nuevaNomina);
            }
        } else {
            System.out.println("No se realizaron cambios en el usuario.");
        }

        System.out.println("Usuario final:");
        System.out.println(u);

		Ingresos ingresos = new Ingresos(u.getNominaBruta());
		System.out.println("INGRESOS\n");
		ingresos.rellenarWallapop(sc);
		ingresos.rellenarHerencia(sc);
		ingresos.imprimirInformacion();

        Alumno3 kiriki = new Alumno3();
		Menu.menu(kiriki);


		String opcio;
		ArrayList<Viajes> ListaViajes = new ArrayList<>();
		Scanner leer = new Scanner(System.in);

		String fecha;
		String coste;
		String destino;

		do {
			System.out.println("¿Has realizado algun viaje? si/no");
			opcio = leer.nextLine();
		} while (!opcio.equalsIgnoreCase("si") && !opcio.equalsIgnoreCase("no"));
		opcio = opcio.trim();

		if (opcio.equalsIgnoreCase("si")) {
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
				opcio = leer.nextLine();
			} while (!opcio.equals("1"));

			for (Viajes e : ListaViajes) {
				System.out.println( e.toString());
			}

		}

		leer.close();
	}
}
