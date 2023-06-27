package paquete01;

import java.util.ArrayList;

public class Cuenta {
    private String nombreCliente;
    private double IVA;
    private ArrayList<Menu> listadoDeMenus;
    private double subtotal;
    private double total;

    public Cuenta(String nombreCliente, double IVA, ArrayList<Menu> listadoDeMenus) {
        this.nombreCliente = nombreCliente;
        this.IVA = IVA;
        this.listadoDeMenus = listadoDeMenus;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public ArrayList<Menu> getListadoDeMenus() {
        return listadoDeMenus;
    }

    public void setListadoDeMenus(ArrayList<Menu> listadoDeMenus) {
        this.listadoDeMenus = listadoDeMenus;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n");

        for(Menu menu : listadoDeMenus){
            sb.append(menu.toString()).append("\n");
        }

        sb.append("Subtotal: ").append(subtotal).append("\n");
        sb.append("IVA: ").append(IVA).append("%\n");
        sb.append("Total a pagar: ").append(total).append("\n");

        return sb.toString();
    }
}
