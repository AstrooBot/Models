public class Prueba {

    public static void main(String[] args) {
    SituacionMilitarFabrica fabrica = new SituacionMilitarFabrica();
    Documento documento1 = new Documento("No Aplica"); 
    Documento documento2 = new LibretaMilitar("Libreta Militar");
    Ciudadano ciudadano1 = fabrica.setCiudadano("Matthew", "Rodriguez", 1080943, documento1);
    Ciudadano ciudadano2 = fabrica.setCiudadano("Matthew2", "Rodriguez2", 1080944, documento2);

    System.out.println(ciudadano1.situacionMilitar.documento);
    System.out.println(ciudadano2.situacionMilitar.documento);
    

    }
}
