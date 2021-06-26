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
public class menuEconomico extends Menu {

    private int porcentaje;

    public menuEconomico(String nombrePlato, double valorInicialMenu, int p) {
        super(nombrePlato, valorInicialMenu);
        porcentaje = p;
    }

    public void setPorcentajeDescuento(int pro) {
        porcentaje = pro;
    }

    public int getPorcentajeDescuento() {
        return porcentaje;
    }

    @Override
    public String toString() {
        String cadena = String.format("----------- Menu Economico -----------\n"
                + "%s\t> Porcentaje descuento: %d%s\n"
                + "\t> Valor total del menu: %.2f$\n",
                super.toString(),
                getPorcentajeDescuento(),"%", getValorMenu());

        return cadena;
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = valorInicialMenu + porcentaje
                - ((valorInicialMenu * porcentaje) / 100);
    }

}
