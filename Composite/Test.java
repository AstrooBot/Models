public class Test {

    public static void main(String[] args) {

        Component carpeta0 = new Carpeta("Carpeta raiz");
        Component carpeta1 = new Carpeta("Carpeta 1");
        Component archivo1 = new Archivo("Archivo", "txt");
        Component archivo2 = new Archivo("Archivo", "sh");
        Component archivo3 = new Archivo("Archivo", "bat");

        carpeta1.composite.Add(archivo1);
        carpeta1.composite.Add(archivo2);
        carpeta1.composite.Add(archivo3);
        carpeta0.composite.Add(carpeta1);
        carpeta0.getElements();

    }
}