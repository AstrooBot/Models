public class Main {
    public static void main(String[] args) {
        Entrada in = new EntradaTeclado();
        Salida out = new SalidaTeclado();
        float peso = Integer.parseInt(in.capturar("Ingrese su peso"));
        float altura = Integer.parseInt(in.capturar("Ingrese su altura"));
        ICalculadoraIMC calculadora = new ProxyIMC();
        String res = calculadora.operar(peso, altura) + "";
        out.enviar("IMC : " + res);

    }

}
