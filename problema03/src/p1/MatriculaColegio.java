package p1;

public class MatriculaColegio extends Matricula {
    private double costoDeportes;
    private double costoFolletos;
    private double costoUniformes;
    private double costoLaboratorios;

    public MatriculaColegio(double costoDeportes, double costoFolletos, double costoUniformes, double costoLaboratorios) {
        this.costoDeportes = costoDeportes;
        this.costoFolletos = costoFolletos;
        this.costoUniformes = costoUniformes;
        this.costoLaboratorios = costoLaboratorios;
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

    public double getCostoLaboratorios() {
        return costoLaboratorios;
    }

    public void setCostoLaboratorios(double costoLaboratorios) {
        this.costoLaboratorios = costoLaboratorios;
    }

    @Override
    public void establecerTarifa() {
        this.tarifa = this.costoDeportes + this.costoFolletos + this.costoUniformes + this.costoLaboratorios;
    }

    @Override
    public String toString() {
        return "MatriculaColegio{" +
                "tarifa=" + tarifa +
                ", costoDeportes=" + costoDeportes +
                ", costoFolletos=" + costoFolletos +
                ", costoUniformes=" + costoUniformes +
                ", costoLaboratorios=" + costoLaboratorios +
                '}';
    }
}
