/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete01.Cuenta;

import MenuRestaurante.Menu;
import MenuRestaurante.MenuCarta;
import MenuRestaurante.MenuDia;
import MenuRestaurante.MenuEconomico;
import MenuRestaurante.MenuNiños;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear los objetos de menú
        MenuNiños niños1 = new MenuNiños("Niños 01", 4.5, 2.0, 1.0, 1.5);
        MenuNiños niños2 = new MenuNiños("Niños 02", 5.5, 3.0, 1.0, 1.5);
        MenuEconomico economico = new MenuEconomico("Econo 001", 3.0, 4.0, 25.0);
        MenuDia dia = new MenuDia("Dia 001", 7.0, 1.0, 1.0);
        MenuCarta carta = new MenuCarta("Carta 001", 10.10, 6.0, 1.5, 2.0, 10.0);

        // Crear el listado de cartas
        ArrayList<Menu> listado = new ArrayList<Menu>();
        listado.add(niños1);
        listado.add(niños2);
        listado.add(economico);
        listado.add(dia);
        listado.add(carta);

        // Crear el objeto de Cuenta
        Cuenta cuenta = new Cuenta("René Elizalde", 10.0, listado);

        // Calcular el subtotal
        double subtotal = 0;
        for(Menu menu : listado){
            subtotal += menu.getValorMenu();
        }
        cuenta.setSubtotal(subtotal);

        // Calcular el total
        cuenta.setTotal(cuenta.getSubtotal() * (1 + cuenta.getIVA()/100));

        // Mostrar la factura
        System.out.println(cuenta);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/