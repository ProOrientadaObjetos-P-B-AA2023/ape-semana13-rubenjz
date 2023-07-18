package p1;

public class MatriculaCampamento extends Matricula{
    private double costoTransporte;
    private double costoComida;
    private double costoInstructores;

    public MatriculaCampamento(double costoTransporte, double costoComida, double costoInstructores) {
        this.costoTransporte = costoTransporte;
        this.costoComida = costoComida;
        this.costoInstructores = costoInstructores;
    }

    public double getCostoTransporte() {
        return costoTransporte;
    }

    public void setCostoTransporte(double costoTransporte) {
        this.costoTransporte = costoTransporte;
    }

    public double getCostoComida() {
        return costoComida;
    }

    public void setCostoComida(double costoComida) {
        this.costoComida = costoComida;
    }

    public double getCostoInstructores() {
        return costoInstructores;
    }

    public void setCostoInstructores(double costoInstructores) {
        this.costoInstructores = costoInstructores;
    }

    @Override
    public void establecerTarifa() {
        this.tarifa = this.costoTransporte + this.costoComida + this.costoInstructores;
    }

    @Override
    public String toString() {
        return "MatriculaCampamento{" +
                "tarifa=" + tarifa +
                ", costoTransporte=" + costoTransporte +
                ", costoComida=" + costoComida +
                ", costoInstructores=" + costoInstructores +
                '}';
    }
}
