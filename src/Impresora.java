public class Impresora extends Dispositivo {
    public Impresora(String nombre, boolean activo) {
        super(nombre, activo);
    }

    @Override
    public void ejecutarDiagnostico() {
        System.out.println("Impresora Funcionando");
    }
}
