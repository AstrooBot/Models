
import java.util.*;
public class FabricaMotor {

    ArrayList<Motor> motores = new ArrayList<Motor>();

    public Motor getMotor(int id) {
        Motor resultado = null;
        for (Motor motor : motores) {
            if (motor.getId() == id) {
                System.out.println("Reutilizando motor");
                resultado = motor;
            }
        }
        if (resultado == null) {
            resultado = new MotorPesado(id);
            motores.add(resultado);
            System.out.println("Creando motor nuevo");
        }
        return resultado;
        
    }

}