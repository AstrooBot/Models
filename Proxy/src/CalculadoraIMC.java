import java.lang.Math;

public class CalculadoraIMC implements ICalculadoraIMC {
    @Override
    public float operacion(float peso, float altura) {
        double altura1 = (double) altura;
        return (float) (peso/Math.pow(altura1,2));
    }

}


