import java.util.Scanner;

public class EntradaTeclado {
   String input;

   public String capturar() {
      Scanner input_capture = new Scanner(System.in);
      this.input = input_capture.nextLine();
      return input;
   }

}
