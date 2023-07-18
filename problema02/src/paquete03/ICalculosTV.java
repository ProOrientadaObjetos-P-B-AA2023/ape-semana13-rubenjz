package paquete03;

import paquete01.Televisor;

import java.util.ArrayList;

public interface ICalculosTV {
    double calcularPrecioTotal(ArrayList<Televisor> televisores);

    String televisorMasCaro(ArrayList<Televisor> televisores);

    String listaMarcasVendidas(ArrayList<Televisor> televisores);
}
