package paquete003;

import paquete001.Persona;
import paquete004.*;

import java.util.List;

public class BilleteraPagos {
    public Persona persona;
    public String mes;
    public List<Pagos> listaPagos;
    public double gastoPagos;

    public BilleteraPagos(String mes, Persona persona, List<Pagos> listaPagos) {
        this.mes = mes;
        this.persona = persona;
        this.listaPagos = listaPagos;
    }

    public BilleteraPagos(double gastoPagos, String mes, Persona persona, List<Pagos> listaPagos) {
        this.gastoPagos = gastoPagos;
        this.mes = mes;
        this.persona = persona;
        this.listaPagos = listaPagos;
    }

    public void calcularSubtotal(){
        this.gastoPagos = 0;
        for(Pagos pagos : listaPagos){
            this.gastoPagos = this.gastoPagos + pagos.getPago();
        }
    }

    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "persona=" + persona +
                ", mes='" + mes + '\'' +
                ", listaPagos=" + listaPagos +
                ", gastoPagos=" + gastoPagos +
                '}';
    }
}
