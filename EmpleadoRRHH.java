public class EmpleadoRRHH extends TrabajoCorporativo{
    public EmpleadoRRHH(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    @Override
    public double calcularBonoAnual() {
        return sueldoBase * 0.10;
    }
}
