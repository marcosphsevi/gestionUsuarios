package gestion_usuario;
import java.util.*;
public class Menu {


	public static void menu(Alumno3 kiriki, Scanner sc) {

		boolean valido=false;
		while (!valido) {
			try {


				int opcion;					
				
				System.out.println("Seleccione la opción que desee.");
				System.out.println("1. Sus gastos de alquiler.");
				System.out.println("2. Sus gastos en viajes.");
				System.out.println("3. Sus gastos varios.");
				System.out.println("4. Salir.");

				opcion = sc.nextInt();
				switch (opcion) {

				case 1:
					double alquiler1;
					System.out.println("Escriba sus gastos de alquiler: ");
					alquiler1 = sc.nextDouble();
					kiriki.setAlquiler(alquiler1);
					break;
				case 2:
					double viajes1;
					System.out.println("Escriba sus gastos en viajes: ");
					viajes1 = sc.nextDouble();
					kiriki.setViajes(viajes1);
					break;
				case 3:
					double gastosvarios1;
					System.out.println("Escriba sus gastos varios: ");
					gastosvarios1 = sc.nextDouble();
					kiriki.setGastosvarios(gastosvarios1);
					break;
				case 4:
					kiriki.calculoGastos();
					System.out.println("Finalizando programa...");
					System.out.println();
					valido = true;
					break;
				default:
					System.out.println("Opción no válida.");
					System.out.println();
					break;

				}

				

			}catch (InputMismatchException e) {
				System.err.println("Error, porfavor introduzca bien el contenido.");
				System.out.println();
				sc.nextLine();
			}
		}
	}
}
