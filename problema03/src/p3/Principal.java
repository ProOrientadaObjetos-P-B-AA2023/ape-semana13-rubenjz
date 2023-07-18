package p3;

import p1.*;
import p2.TipoMatricula;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> list = new ArrayList<>();
        list.add(new MatriculaCampamento(102,30.2,90.2));
        list.add(new MatriculaColegio(150.2,140.2,240.2,300.4));
        list.add( new MatriculaEscuela(50.2,40.2,140.2,200.4));
        list.add (new MatriculaJardin(50.2,140.2,40));
        list.add(new MatriculaMaternal(50.2,40.2,80.2));
        list.add(new MatriculaMaternal(50.2,40.2,80.2));

        for (Matricula matricula: list){
            matricula.establecerTarifa();
        }

        TipoMatricula tipoMatricula = new TipoMatricula(list);
        tipoMatricula.establecerPromedioTarifas();
        System.out.println(tipoMatricula);
    }
}
