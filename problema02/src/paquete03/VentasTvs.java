package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {
    private ArrayList<Televisor> televisores;
    private String marcasVendidas;
    private double precioTotal;
    private String televisorMasCaro;
    private ICalculosTV calculosTV;

    public VentasTvs(ArrayList<Televisor> televisores) {
        this.televisores = televisores;
    }

    public void calcularPrecioTotal(){
        this.precioTotal = calculosTV.calcularPrecioTotal(televisores);
    }

    public void listaMarcasVendidas() {
        this.marcasVendidas = calculosTV.listaMarcasVendidas(televisores);
    }

    public void televisorMasCaro() {
        this.televisorMasCaro = calculosTV.televisorMasCaro(televisores);
    }

    @Override
    public String toString() {
        return "VentasTvs{" +
                "televisores=" + televisores +
                ", marcasVendidas='" + marcasVendidas + '\'' +
                ", precioTotal=" + precioTotal +
                ", televisorMasCaro='" + televisorMasCaro + '\'' +
                '}';
    }
}
