package gestion_usuario;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ingresos ingresos = new Ingresos(2000);
		System.out.println("INGRESOS\n");
		ingresos.rellenarWallapop(sc);
		ingresos.rellenarHerencia(sc);
		ingresos.imprimirInformacion();
	}
}
