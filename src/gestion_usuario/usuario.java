package gestion_usuario;

public class usuario {

    private String nombre;
    private String email;
    private double nominaBruta;

    public usuario(String nombre, String email, double nominaBruta) {
        this.nombre = nombre;
        this.email = email;
        this.nominaBruta = nominaBruta;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public double getNominaBruta() { return nominaBruta; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEmail(String email) { this.email = email; }
    public void setNominaBruta(double nominaBruta) { this.nominaBruta = nominaBruta; }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", nominaBruta=" + nominaBruta +
                '}';
    }
}