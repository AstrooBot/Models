public class Prueba {
 
    public static void main(String[] args) {
        FabricaMotor fabrica = new FabricaMotor();
        Motor motor1 = fabrica.getMotor(1);
        motor1.operation(1);
        Motor motor2 = fabrica.getMotor(2);
        motor2.operation(2);
        Motor motor3 = fabrica.getMotor(1);
        motor3.operation(1);
    }
}
