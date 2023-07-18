package paquete005;

import paquete001.Persona;
import paquete002.*;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        Casa casa = new Casa();
        Comercio comercio = new Comercio();
        ICiudad iCiudad = new Ciudad_Loja();
        ICiudad iCiudad1 = new Ciudad_x();
        Ciudad ciudad1 = new Ciudad("Loja");
        Propiedad propiedad = new Casa(56000);
        Propiedad propiedad1 = new Casa(56000);

        //Pagos
        Persona persona = new Persona("Pato","Paton",18,"1105784218",ciudad1);
        PagoAguaPotable aguaCasa = new PagoAguaPotable(2.20,100.2,0.2,casa);
        PagoAguaPotable aguaComercio = new PagoAguaPotable(2.20,100.2,0.2,comercio);
        PagoLuzElectrica luzCasa = new PagoLuzElectrica(10.20,80,0.5,iCiudad);
        PagoLuzElectrica luzComercio = new PagoLuzElectrica(10.20,80,0.5,iCiudad1);
        PagoPredial casa1 = new PagoPredial(propiedad,10);
        PagoPredial casa2 = new PagoPredial(propiedad1,10);
        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional(6.20, 100,0.2);
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional(6.20, 100,0.2);

        aguaCasa.calcularPago();
        aguaComercio.calcularPago();
        luzCasa.calcularPago();
        luzComercio.calcularPago();
        casa1.calcularPago();
        casa2.calcularPago();
        telefonoCasa.calcularPago();
        telefonoFinca.calcularPago();

        list.add(aguaCasa);
        list.add(aguaComercio);
        list.add(luzCasa);
        list.add(luzComercio);
        list.add(casa1);
        list.add(casa2);
        list.add(telefonoCasa);
        list.add(telefonoFinca);

        BilleteraPagos pago = new BilleteraPagos("12",persona,list);
        pago.calcularSubtotal();

        System.out.println(pago);
    }
}
