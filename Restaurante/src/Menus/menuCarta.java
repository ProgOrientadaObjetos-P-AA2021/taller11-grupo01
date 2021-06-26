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
public class menuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private int porcenForService;

    public menuCarta(String nombrePlato, double valorInicialMenu,
            double valorGuarnicion, double valorBebida, int porcentaje) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        this.porcenForService = porcentaje;
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void setPorcenForService(int porcenForService) {
        this.porcenForService = porcenForService;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public int getPorcenForService() {
        return porcenForService;
    }

    @Override
    public String toString() {
        String cadena = String.format("----------- Menu de la Carta -----------"
                + "\n%s\t> Valor de Guarnición %.2f$\n"
                + "\t> Valor de Bebida: %.2f$\n"
                + "\t> Porcentaje adicional: %d%s\n"
                + "\t> Valor total del menu: %.2f$\n",
                super.toString(),
                getValorGuarnicion(),
                getValorBebida(), getPorcenForService(), "%", getValorMenu());

        return cadena;
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = valorInicialMenu + valorGuarnicion + valorBebida
                + ((valorInicialMenu * porcenForService) / 100);
    }

}
