package p1;

public class MatriculaJardin extends Matricula {
    private double costoDesayunos;
    private double costoAlmuerzo;
    private double costoMedico;

    public MatriculaJardin(double costoDesayunos, double costoAlmuerzo, double costoMedico) {
        this.costoDesayunos = costoDesayunos;
        this.costoAlmuerzo = costoAlmuerzo;
        this.costoMedico = costoMedico;
    }

    public double getCostoDesayunos() {
        return costoDesayunos;
    }

    public void setCostoDesayunos(double costoDesayunos) {
        this.costoDesayunos = costoDesayunos;
    }

    public double getCostoAlmuerzo() {
        return costoAlmuerzo;
    }

    public void setCostoAlmuerzo(double costoAlmuerzo) {
        this.costoAlmuerzo = costoAlmuerzo;
    }

    public double getCostoMedico() {
        return costoMedico;
    }

    public void setCostoMedico(double costoMedico) {
        this.costoMedico = costoMedico;
    }

    @Override
    public void establecerTarifa() {
        this.tarifa = this.costoDesayunos + this.costoAlmuerzo + this.costoMedico;
    }

    @Override
    public String toString() {
        return "MatriculaJardin{" +
                "tarifa=" + tarifa +
                ", costoDesayunos=" + costoDesayunos +
                ", costoAlmuerzo=" + costoAlmuerzo +
                ", costoMedico=" + costoMedico +
                '}';
    }
}
