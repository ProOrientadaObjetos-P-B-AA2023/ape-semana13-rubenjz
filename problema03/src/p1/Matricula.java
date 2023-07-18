package p1;

public abstract class Matricula {
    protected double tarifa;

    public Matricula() {
    }

    public double getTarifa() {
        return tarifa;
    }

    public abstract void establecerTarifa();

    @Override
    public String toString() {
        return "Matricula{" +
                "tarifa=" + tarifa +
                '}';
    }
}
