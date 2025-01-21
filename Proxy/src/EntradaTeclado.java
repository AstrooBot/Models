import java.util.Scanner;
public class EntradaTeclado implements Entrada {
    String input;
    @Override
    public String capturar(String texto) {
        Scanner input_capture = new Scanner(System.in);
        System.out.println(texto);
        this.input = input_capture.nextLine();
        return input;
    }

}
