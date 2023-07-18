package p1;

public class MatriculaEscuela extends Matricula {
    private double costoLibros;
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;

    public MatriculaEscuela(double costoLibros, double costoDeportes, double costoFolletos, double costoUniformes) {
        this.costoLibros = costoLibros;
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
    }

    public double getCostoLibros() {
        return costoLibros;
    }

    public void setCostoLibros(double costoLibros) {
        this.costoLibros = costoLibros;
    }

    public double getCostoDeportes() {
        return costoDeportes;
    }

    public void setCostoDeportes(double costoDeportes) {
        this.costoDeportes = costoDeportes;
    }

    public double getCostoFolletos() {
        return costoFolletos;
    }

    public void setCostoFolletos(double costoFolletos) {
        this.costoFolletos = costoFolletos;
    }

    public double getCostoUniformes() {
        return costoUniformes;
    }

    public void setCostoUniformes(double costoUniformes) {
        this.costoUniformes = costoUniformes;
    }

    @Override
    public void establecerTarifa() {
        this.tarifa = this.costoLibros + this.costoDeportes + this.costoFolletos + this.costoUniformes;
    }

    @Override
    public String toString() {
        return "MatriculaEscuela{" +
                "tarifa=" + tarifa +
                ", costoLibros=" + costoLibros +
                ", costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                '}';
    }
}
