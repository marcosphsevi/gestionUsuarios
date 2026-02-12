package gestion_usuario;

public class Alumno3 {
	
	private double alquiler;
	private double viajes;
	private double gastosvarios;
	
	public Alumno3 (double alquiler, double viajes, double gastosvarios) {
		this.alquiler = alquiler;
		this.viajes = viajes;
		this.gastosvarios = gastosvarios;
	}
	public Alumno3 () {
		
	}
	
	public double getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(double alquiler) {
		this.alquiler = alquiler;
	}
	public double getViajes() {
		return viajes;
	}
	public void setViajes(double viajes) {
		this.viajes = viajes;
	}
	public double getGastosvarios() {
		return gastosvarios;
	}
	public void setGastosvarios(double gastosvarios) {
		this.gastosvarios = gastosvarios;
	}
	
	public void calculoGastos() {
		double gastoTotal = alquiler + viajes + gastosvarios;
		System.out.println("Su gasto total es de: "+gastoTotal);
	}
	
	
	
}
