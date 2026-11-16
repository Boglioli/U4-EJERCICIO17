public abstract class TrabajoCorporativo {
    protected String nombre;
    protected double sueldoBase;
    public TrabajoCorporativo(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }
    public abstract double calcularBonoAnual();
}
