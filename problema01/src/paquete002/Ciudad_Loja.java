package paquete002;

public class Ciudad_Loja extends Ciudad implements ICiudad {
    public Ciudad_Loja() {
    }

    public Ciudad_Loja(String nombreCiudad) {
        super(nombreCiudad);
    }

    @Override
    public double pagoCiudad(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        return tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
    }
}
