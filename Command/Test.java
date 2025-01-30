package Command;

public class Test {
      public static void main(String[] args) {
            Receiver receptorSuma = new ReceiverSuma();
            Receiver receptorResta = new ReceiverResta();
            
            Command comandoSuma = new Command1(receptorSuma, 5, 3);
            Command comandoResta = new Command1(receptorResta, 5, 3);
            
            System.out.println(comandoSuma.ejecutar() + "");
            System.out.println(comandoResta.ejecutar() + "");
        }    
}
