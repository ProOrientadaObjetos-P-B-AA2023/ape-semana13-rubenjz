package paquete004;

import paquete002.ICiudad;

public class PagoLuzElectrica extends Pagos{
    private double tarifaBase;
    private double kilovatiosConsumidos;
    private double costoKilovatio;
    private ICiudad ciudad;

    public PagoLuzElectrica(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio, ICiudad ciudad) {
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
        this.ciudad = ciudad;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getKilovatiosConsumidos() {
        return kilovatiosConsumidos;
    }

    public void setKilovatiosConsumidos(double kilovatiosConsumidos) {
        this.kilovatiosConsumidos = kilovatiosConsumidos;
    }

    public double getCostoKilovatio() {
        return costoKilovatio;
    }

    public void setCostoKilovatio(double costoKilovatio) {
        this.costoKilovatio = costoKilovatio;
    }

    @Override
    public void calcularPago() {
        this.pago = ciudad.pagoCiudad(this.tarifaBase, this.kilovatiosConsumidos, this.costoKilovatio);
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" +
                "tarifaBase=" + tarifaBase +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio +
                ", ciudad=" + ciudad +
                ", pago=" + pago +
                '}';
    }
}
