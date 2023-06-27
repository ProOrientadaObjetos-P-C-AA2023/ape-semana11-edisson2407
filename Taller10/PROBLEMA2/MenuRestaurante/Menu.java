package MenuRestaurante;

public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu, valorInicialDelMenu;

    public Menu(String nombrePlato, double valorMenu, double valorInicialDelMenu) {
        this.nombrePlato = nombrePlato;
        this.valorMenu = valorMenu;
        this.valorInicialDelMenu = valorMenu;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public abstract String getDescripcion();

    public void setValorMenu(double valorMenu) {
        this.valorMenu = valorMenu;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setValorInicialDelMenu(double valorInicialDelMenu) {
        this.valorInicialDelMenu = valorInicialDelMenu;
    }

    public double getValorInicialDelMenu() {
        return valorInicialDelMenu;
    }

    

    @Override
    public String toString() {
        return "MenuRestaurante{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                '}';
    }

}