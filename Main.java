public class Main {
    public static void main(String[] args) {
        LiquidadorSueldos liquidor = new LiquidadorSueldos();
        TrabajoCorporativo empleado1 = new EmpleadoVentas("gabriel", 300000);
        TrabajoCorporativo empleado2 = new EmpleadoSistemas("martin", 350000);
        TrabajoCorporativo empleado3 = new EmpleadoRRHH("sofia", 450000);
        liquidor.liquidar(empleado1);
        liquidor.liquidar(empleado2);
        liquidor.liquidar(empleado3);

    }
}
