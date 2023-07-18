package paquete004;

import paquete002.Propiedad;

public class PagoAguaPotable extends Pagos{
    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private Propiedad propiedad;

    public PagoAguaPotable(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos, Propiedad propiedad) {
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
        this.propiedad = propiedad;
    }

    public double getTarifaFija() {
        return tarifaFija;
    }

    public void setTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public double getMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public void setMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public double getCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public void setCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    @Override
    public void calcularPago() {
        this.pago = propiedad.costoPagoAgua(this.tarifaFija, this.metrosCubicosConsumo, this.costoConsumoCubicos);
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" +
                "tarifaFija=" + tarifaFija +
                ", metrosCubicosConsumo=" + metrosCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                ", propiedad=" + propiedad +
                ", pago=" + pago +
                '}';
    }
}
