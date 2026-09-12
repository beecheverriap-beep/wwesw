public class Main {
    public static void main(String[] args) {

        Dispositivo dispositivo = new Dispositivo("Hola", true);
        dispositivo.mostrarEstado();
        dispositivo.ejecutarDiagnostico();
    }
}
