
public class EmpleadoVentas extends TrabajoCorporativo{
    public EmpleadoVentas(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }
    @Override
    public double calcularBonoAnual() {
        return sueldoBase * 0.15;
    }
}
