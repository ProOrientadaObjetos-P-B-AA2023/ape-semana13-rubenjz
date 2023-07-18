package paquete002;

public class Ciudad_x extends Ciudad implements ICiudad {
    public Ciudad_x() {
    }

    public Ciudad_x(String nombreCiudad) {
        super(nombreCiudad);
    }

    @Override
    public double pagoCiudad(double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        return tarifaBase + (kilovatiosConsumidos * costoKilovatio);
    }

}
