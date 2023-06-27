package MenuRestaurante;

public class MenuEconomico extends Menu {
    protected double valorPorcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorMenu, double valorInicial, double valorPorcentajeDescuento) {
        super(nombrePlato, valorMenu, valorInicial);
        this.valorPorcentajeDescuento = valorPorcentajeDescuento;
    }

    @Override
    public String getDescripcion() {
        return "Menu Economico: " + nombrePlato + " con un valor de: " + valorMenu + " con un descuento de: " + valorPorcentajeDescuento;
    }

    @Override
    public String toString() {
        return "MenuEconomico{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorPorcentajeDescuento=" + valorPorcentajeDescuento +
                '}';
    }

    public double getValorPorcentajeDescuento() {
        return valorPorcentajeDescuento;
    }

    public void setValorPorcentajeDescuento(double valorPorcentajeDescuento) {
        this.valorPorcentajeDescuento = valorPorcentajeDescuento;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public double getValorInicialDelMenu() {
        return valorInicialDelMenu;
    }

    public void setValorInicialDelMenu(double valorInicialDelMenu) {
        this.valorInicialDelMenu = valorInicialDelMenu;
    }

}