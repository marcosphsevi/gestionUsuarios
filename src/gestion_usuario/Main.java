package gestion_usuario;
import java.util.*;

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

        sc.close();
    }
}