package restaurante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nixon
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    @Override
    public String toString() {
        String cadena = String.format(">>>>>>>> Menu del Dia <<<<<<<<\n"
                + "%s>\tValor del Postre: %.2f\n"
                + ">\tValor  de Bebida: %.2f\n",
                super.toString(),
                getValorPostre(),
                getValorBebida());

        return cadena;
    }

    @Override
    public void setValorMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
