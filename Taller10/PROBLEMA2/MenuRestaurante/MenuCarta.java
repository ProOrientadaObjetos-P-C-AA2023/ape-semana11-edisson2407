package MenuRestaurante;

public class MenuCarta extends Menu {
    private double valorProcionGuarnicion, valorBebida, porcentajeAdicional;

    public MenuCarta(String nombrePlato, double valorMenu, double valorInicialDelMenu, double valorProcionGuarnicion, double valorBebida, double porcentajeAdicional) {
        super(nombrePlato, valorMenu, valorInicialDelMenu);
        this.valorProcionGuarnicion = valorProcionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    @Override
    public String getDescripcion() {
        return "Menu a la carta: " + nombrePlato + " con un valor de: " + valorMenu + " incluye: " + valorProcionGuarnicion + " y " + valorBebida;
    }

    @Override
    public String toString() {
        return "MenuCarta{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorProcionGuarnicion=" + valorProcionGuarnicion +
                ", valorBebida=" + valorBebida +
                ", porcentajeAdicional=" + porcentajeAdicional +
                '}';
    }

    public double getValorProcionGuarnicion() {
        return valorProcionGuarnicion;
    }

    public void setValorProcionGuarnicion(double valorProcionGuarnicion) {
        this.valorProcionGuarnicion = valorProcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
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

    public double calcularValorMenu() {
        return valorInicialDelMenu + valorProcionGuarnicion + valorBebida + (valorInicialDelMenu * porcentajeAdicional);
    }

}