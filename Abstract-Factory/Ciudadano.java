public class Ciudadano {
    String nombre;
    String apellido;
    double  cedula;
    Documento situacionMilitar;
    public Ciudadano(String nombre, String apellido, double cedula, Documento situacionMilitar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.situacionMilitar = situacionMilitar;
    }
}