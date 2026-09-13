public class Main {
    public static void main(String[] args) {


        Proyector proyector = new Proyector("Blessd", false);
        Computador computador = new Computador("Acapel", true);
        Impresora impresora = new Impresora("Hola", false);

        Dispositivo dispositivo = new Dispositivo("Hola", true);

        Dispositivo dispositivo1 = new Proyector("Hola como estas", true);
        Dispositivo dispositivo2 = new Impresora("Hola sddwewsadsad", false);
        Dispositivo dispositivo3 = new Computador("Hola csasad", true);


        dispositivo1.ejecutarDiagnostico();
        dispositivo2.ejecutarDiagnostico();
        dispositivo3.ejecutarDiagnostico();

        proyector.mostrarEstado();
        computador.mostrarEstado();
        impresora.mostrarEstado();

        proyector.ejecutarDiagnostico();
        computador.ejecutarDiagnostico();
        impresora.ejecutarDiagnostico();

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}
