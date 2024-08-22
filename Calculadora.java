
package com.mycompany.calculadora;


public class Calculadora {

    public static void main(String[] args) {
        int entrada1;
        int entrada2;
        EntradaSalidaTecladoFactory fabrica = new EntradaSalidaTecladoFactory(); 
        Entrada objEntrada = fabrica.generarEntrada();
        Salida objSalida = fabrica.generarSalida();
        Cliente objCliente = new Cliente(objEntrada, objSalida);
        OperacionSuma  objSumaFabrica = new OperacionSuma();
        OperacionResta objRestaFabrica = new OperacionResta();
        OperacionMultiplicar objMultiplicarFabrica = new OperacionMultiplicar();
        OperacionDivision objDivisionFabrica = new OperacionDivision();
        
        Operacion objSuma = objSumaFabrica.generarOperacion();
        Operacion objResta = objRestaFabrica.generarOperacion();
        Operacion objMultiplicar = objMultiplicarFabrica.generarOperacion();
        Operacion objDivision = objDivisionFabrica.generarOperacion();
        
        objCliente.salida.enviar("ingrese valor1 :");
        entrada1 =  Integer.parseInt(objCliente.entrada.capturar());
        objCliente.salida.enviar("ingrese valor2 :");
        entrada2 = Integer.parseInt(objCliente.entrada.capturar());;
        
        objCliente.salida.enviar(objSuma.operar(entrada1, entrada2)+ "");
        objCliente.salida.enviar(objResta.operar(entrada1, entrada2)+ "");
        objCliente.salida.enviar(objMultiplicar.operar(entrada1, entrada2)+ "");
        objCliente.salida.enviar(objDivision.operar(entrada1, entrada2)+ "");
        
    }
 
}
