package Command;


public class Command1 implements Command {

    Receiver receiver;
    int valor1, valor2;
    public Command1(Receiver receptor, int valor1, int valor2) {
        this.receiver = receptor;
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public int ejecutar() {
       return this.receiver.operacion(this.valor1, this.valor2);
    }
    
    
}
