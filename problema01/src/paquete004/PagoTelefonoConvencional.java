package paquete004;

import paquete001.Persona;

public class PagoTelefonoConvencional extends Pagos {
    private double tarifa;
    private double minutosConsumidos;
    private double costoMinuto;

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void setMinutosConsumidos(double minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    @Override
    protected void calcularPago() {
        this.pago = this.tarifa + (this.minutosConsumidos * this.costoMinuto);
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" +
                "tarifa=" + tarifa +
                ", minutosConsumidos=" + minutosConsumidos +
                ", costoMinuto=" + costoMinuto +
                ", pago=" + pago +
                '}';
    }
}
