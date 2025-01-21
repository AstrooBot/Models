/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

public class SalidaTeclado implements Salida{
    String mensaje;
    @Override
    public void enviar(String data) {
        mensaje = data;
        System.out.println("Resultado : " + mensaje);
    }
    
}
