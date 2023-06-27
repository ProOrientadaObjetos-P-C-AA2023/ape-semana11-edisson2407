package MenuRestaurante;

public class MenuNiños extends Menu {
    private double valorHelado, valorPastel;

    public MenuNiños(String nombrePlato, double valorMenu, double valorInicialDelMenu, double valorHelado, double valorPastel) {
        super(nombrePlato, valorMenu, valorInicialDelMenu);
        this.valorHelado = valorHelado;
        this.valorPastel = valorPastel;
    }

    @Override
    public String getDescripcion() {
        return "Menu para niños: " + nombrePlato + " con un valor de: " + valorMenu + " incluye: " + valorHelado + " y " + valorPastel;
    }

    @Override
    public String toString() {
        return "MenuNiños{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorHelado=" + valorHelado +
                ", valorPastel=" + valorPastel +
                '}';
    }

    public double getValorHelado() {
        return valorHelado;
    }

    public void setValorHelado(double valorHelado) {
        this.valorHelado = valorHelado;
    }

    public double getValorPastel() {
        return valorPastel;
    }

    public void setValorPastel(double valorPastel) {
        this.valorPastel = valorPastel;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

}