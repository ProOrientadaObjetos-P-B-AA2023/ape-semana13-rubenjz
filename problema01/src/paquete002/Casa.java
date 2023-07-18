package paquete002;

public class Casa extends Propiedad {
    public Casa() {
    }

    public Casa(double costoPropiedad) {
        super(costoPropiedad);
    }

    @Override
    public double costoPagoAgua(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        return tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
    }
}
