public class SituacionMilitarFabrica {

    public Ciudadano setCiudadano(String nombre, String apellido, double cedula, Documento situacionMilitar ){

        if (situacionMilitar.documento.equals("Libreta Militar")) {
            return new Reservista(nombre, apellido, cedula, situacionMilitar);
        } else if (situacionMilitar.documento.equals("Codigo de Reclutamiento")) {
            return new Reclutado(nombre, apellido, cedula, situacionMilitar);
        }
        else if (situacionMilitar.documento.equals("No Aplica")) {
            return new Remiso(nombre, apellido, cedula, situacionMilitar);
        }
        else if (situacionMilitar.documento.equals("Fecha Aplazado")) {
            return new Aplazado(nombre, apellido, cedula, situacionMilitar);
        }
        else {
            return null;
        }
    }
}
