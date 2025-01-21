public class ProxyIMC implements ICalculadoraIMC {

    ICalculadoraIMC Calculadora = null;
    @Override
    public float operacion(float peso, float altura) {
        if (Calculadora == null) {
            Calculadora = new CalculadoraIMC();
        }
        return Calculadora.operacion(peso, altura); }

}