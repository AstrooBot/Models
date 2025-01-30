package ChainResponsability;

public class test {
    public static void main(String[] args) {
        banco asesor = new banco(10000, 1, "Asesor");
        banco gerente = new banco(50000, 10001, "Gerente");
        banco director = new banco(100000, 50001, "Director");
        asesor.delegarSolcitiud(gerente);
        gerente.delegarSolcitiud(director);

        System.out.println(asesor.solicitudPrestamo(10000));
        System.out.println(asesor.solicitudPrestamo(50000));
        System.out.println(asesor.solicitudPrestamo(100000));
        System.out.println(asesor.solicitudPrestamo(10000000));
    }
    
}
