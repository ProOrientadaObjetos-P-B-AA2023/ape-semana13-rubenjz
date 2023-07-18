package paquete002;

public class Comercio extends Propiedad {
    public Comercio() {
    }

    public Comercio(double costoPropiedad) {
        super(costoPropiedad);
    }

    @Override
    public double costoPagoAgua(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos) {
        return tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
    }
}
