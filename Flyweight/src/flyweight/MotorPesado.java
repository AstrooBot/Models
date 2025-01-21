public class MotorPesado implements Motor {

    public int id;

    public MotorPesado(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void operation(int id) {
        System.out.println("Operando con motor de id: " + id);
    }

}
