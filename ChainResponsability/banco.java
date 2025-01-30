package ChainResponsability;

public class banco {

    public int montoMaximo;
    public int montoMinimo;
    public String entidad;
    public banco siguienteBanco;

    public banco(int montoMaximo, int montoMinimo, String entidad){
        this.montoMaximo = montoMaximo;
        this.montoMinimo = montoMinimo;
        this.entidad = entidad;
    }

    public String solicitudPrestamo(int monto) {
        String result = "";
        if (monto >= montoMinimo && monto <= montoMaximo) {
            result = "Monto aprobado por " + entidad;
        }
        else {
            result = this.siguienteBanco.solicitudPrestamo(monto);
        }
        return result;
    }
    public void delegarSolcitiud(banco banco) {
        this.siguienteBanco = banco;
    }
    
}
