public class LiquidadorSueldos {
    public void liquidar(TrabajoCorporativo trabajador) {
        double bono = trabajador.calcularBonoAnual();
        double total = trabajador.sueldoBase + bono;
        System.out.println("empleado: " + trabajador.nombre);
        System.out.println("sueldo base: " + trabajador.sueldoBase);
        System.out.println("bono anual: " + bono);
        System.out.println("total a cobrar: "+ total);
        System.out.println("-------------------------");
    }
}
