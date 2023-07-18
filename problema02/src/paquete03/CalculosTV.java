package paquete03;

import paquete01.Televisor;

import java.util.ArrayList;

public class CalculosTV implements ICalculosTV {

    @Override
    public double calcularPrecioTotal(ArrayList<Televisor> televisores) {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();

        }
        return s;
    }

    @Override
    public String televisorMasCaro(ArrayList<Televisor> televisores) {
        String s = televisores.get(0).obtenerMarca();
        for (int i = 1; i < televisores.size(); i++){
            if (televisores.get(i).obtenerPrecio() > televisores.get(i-1).obtenerPrecio()){
                s = televisores.get(i).obtenerMarca();
            }
        }
        return s;
    }

    @Override
    public String listaMarcasVendidas(ArrayList<Televisor> televisores) {
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", s, televisores.get(i).obtenerMarca());
        }
        return s;
    }
}
