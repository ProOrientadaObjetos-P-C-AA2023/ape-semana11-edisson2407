package MenuRestaurante;

public class MenuDia extends Menu {
    private double valorDelPostre, valorDeBebida;

    public MenuDia(String nombrePlato, double valorMenu, double valorDelPostre, double valorDeBebida) {
        super(nombrePlato, valorMenu);
        this.valorDelPostre = valorDelPostre;
        this.valorDeBebida = valorDeBebida;
    }

    @Override
    public String getDescripcion() {
        return "Menu del dia: " + nombrePlato + " con un valor de: " + valorMenu + " incluye: " + valorDelPostre + " y " + valorDeBebida;
    }

    @Override
    public String toString() {
        return "MenuDia{" +
                "nombrePlato='" + nombrePlato + '\'' +
                ", valorMenu=" + valorMenu +
                ", valorDelPostre=" + valorDelPostre +
                ", valorDeBebida=" + valorDeBebida +
                '}';
    }

    public double getValorDelPostre() {
        return valorDelPostre;
    }

    public void setValorDelPostre(double valorDelPostre) {
        this.valorDelPostre = valorDelPostre;
    }

    public double getValorDeBebida() {
        return valorDeBebida;
    }

    public void setValorDeBebida(double valorDeBebida) {
        this.valorDeBebida = valorDeBebida;
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