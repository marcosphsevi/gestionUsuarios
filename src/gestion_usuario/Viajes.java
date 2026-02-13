package gestion_usuario;



public class Viajes {

	@Override
	public String toString() {
		return "Viajes \nDestino = " + destino + "\nFecha = " + fecha + "\nCoste del Viaje = " + CosteViaje;
	}

	private String destino;
	private String fecha;
	private double CosteViaje;

	public Viajes(String destino, String fecha, double CosteViaje) {
		// TODO Auto-generated constructor stub
		this.destino=destino;
		this.fecha=fecha;
		this.CosteViaje=CosteViaje;
	}
	
	public String getDestino() {
		return destino;
	}
	public String getFecha() {
		return fecha;
	}
	public double getCosteViaje() {
		return CosteViaje;
	}

}
