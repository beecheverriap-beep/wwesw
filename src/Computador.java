public class Computador extends Dispositivo{
    public Computador(String nombre, boolean activo) {
        super(nombre, activo);
    }
    @Override
    public void ejecutarDiagnostico() {
        System.out.println("Computador Funcionando");
    }
}
