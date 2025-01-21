public class SalidaTeclado implements Salida{
    String mensaje;
    @Override
    public void enviar(String data) {
        mensaje = data;
        System.out.println("Resultado : " + mensaje);
    }

}