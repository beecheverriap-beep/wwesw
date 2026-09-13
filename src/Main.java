public class Main {
    public static void main(String[] args) {


        Proyector proyector = new Proyector("Blessd", false);
        Computador computador = new Computador("Acapel", true);
        Impresora impresora = new Impresora("Hola", false);

        Dispositivo dispositivo = new Dispositivo("Hola", true);


        proyector.mostrarEstado();
        computador.mostrarEstado();
        impresora.mostrarEstado();

        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}
