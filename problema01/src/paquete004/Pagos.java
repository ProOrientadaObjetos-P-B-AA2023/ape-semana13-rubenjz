package paquete004;

public abstract class Pagos {
    protected double pago;

    public Pagos() {
    }

    public double getPago() {
        return this.pago;
    }

    public abstract void calcularPago();
}
