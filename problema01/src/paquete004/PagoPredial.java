package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

public class PagoPredial extends Pagos {
    private Propiedad propiedad;
    private double porcentaje;

    public PagoPredial(Propiedad propiedad, double porcentaje) {
        this.propiedad = propiedad;
        this.porcentaje = porcentaje;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularPago() {
        this.pago = propiedad.getCostoPropiedad() - ((propiedad.getCostoPropiedad() * this.porcentaje)/100);
    }

    @Override
    public String toString() {
        return "PagoPredial{" +
                "propiedad=" + propiedad +
                ", porcentaje=" + porcentaje +
                ", pago=" + pago +
                '}';
    }
}
