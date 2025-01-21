public class Motorligero implements Motor {

    public int id;

    public MotorPesado motorPesado;

    @Override
    public int getId() {
        return motorPesado.getId();
    }

    @Override
    public void operation(int id) {
        motorPesado.operation(id);

    }

}
