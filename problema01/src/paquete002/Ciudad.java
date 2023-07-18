package paquete002;

public class Ciudad {
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombreCiudad='" + nombreCiudad + '\'' +
                '}';
    }
}
