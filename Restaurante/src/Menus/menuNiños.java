/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import MenuAbstratcta.Menu;

/**
 *
 * @author DELL
 */
public class menuNiños extends Menu {

    private double porHelado;
    private double pastel;

    public menuNiños(String nombrePlato, double valorInicialMenu, double he,
            double pa, int porcentaje) {
        super(nombrePlato, valorInicialMenu);
        porHelado = he;
        pastel = pa;

    }

    public void setValorPorcionPatel(double a) {
        pastel = a;

    }

    public void setValorPorcionHelado(double s) {
        porHelado = s;
    }

    public double getValorPorcionHelado() {
        return porHelado;
    }

    public double getValorPorcionPastel() {
        return pastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("----------- Menu para niños -----------\n"
                + "%s\t> Valor Helado: %.2f$\n"
                + "\t> Valor  de Pastel: %.2f$\n"
                + "\t> Valor total del menu: %.2f$\n",
                super.toString(),
                getValorPorcionHelado(),
                getValorPorcionPastel(), getValorMenu());

        return cadena;
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = porHelado + pastel + valorInicialMenu;
    }
}
