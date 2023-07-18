package paquete005;

import paquete001.Persona;
import paquete002.*;
import paquete003.BilleteraPagos;
import paquete004.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pagos> list = new ArrayList<>();

        Casa casa = new Casa();
        Comercio comercio = new Comercio();
        ICiudad iCiudad = new Ciudad_Loja();
        ICiudad iCiudad1 = new Ciudad_x();
        Ciudad ciudad1 = new Ciudad("Loja");
        Propiedad propiedad = new Casa(56000);
        Propiedad propiedad1 = new Casa(56000);

        //Pagos
        Persona persona = new Persona("Pato","Paton",18,"1105784218",ciudad1);
        list.add(new PagoAguaPotable(2.20,100.2,0.2,casa));
        list.add(new PagoAguaPotable(2.20,100.2,0.2,comercio));
        list.add(new PagoLuzElectrica(10.20,80,0.5,iCiudad));
        list.add(new PagoLuzElectrica(10.20,80,0.5,iCiudad1));
        list.add(new PagoPredial(propiedad,10));
        list.add(new PagoPredial(propiedad1,10));
        list.add(new PagoTelefonoConvencional(6.20, 100,0.2));
        list.add(new PagoTelefonoConvencional(6.20, 100,0.2));

        for (Pagos pagos: list){
            pagos.calcularPago();
        }

        BilleteraPagos pago = new BilleteraPagos("12",persona,list);
        pago.calcularSubtotal();

        System.out.println(pago);
    }
}
