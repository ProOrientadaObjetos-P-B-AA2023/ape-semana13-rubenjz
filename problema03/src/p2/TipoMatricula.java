package p2;

import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

import java.util.List;

public class TipoMatricula {
    private List<Matricula> matriculas;
    private double promedio;

    public TipoMatricula(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void establecerPromedioTarifas(){
        for (Matricula matricula : matriculas){
            this.promedio += matricula.getTarifa();
        }
        this.promedio /= matriculas.size();
    }
    
    public double obtenerPromedioTarifas(){
        return this.promedio;
    }

    @Override
    public String toString() {
        return "TipoMatricula{" +
                "matriculas=" + matriculas +
                ", promedio=" + promedio +
                '}';
    }
}
