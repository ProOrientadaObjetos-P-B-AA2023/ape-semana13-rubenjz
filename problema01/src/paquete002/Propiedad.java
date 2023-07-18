package paquete002;

public abstract class Propiedad {
    protected double costoPropiedad;

    public Propiedad() {
    }

    public Propiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public double getCostoPropiedad() {
        return costoPropiedad;
    }

    public abstract double costoPagoAgua(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos);

    @Override
    public String toString() {
        return "Propiedad{" +
                "costoPropiedad=" + costoPropiedad +
                '}';
    }
}
