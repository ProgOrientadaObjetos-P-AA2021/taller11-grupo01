/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author DELL
 */
public class menuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcenForService;

    public menuCarta(String nombrePlato, double valorInicialMenu,
            double valorGuarnicion, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorGuarnicion = valorGuarnicion;
        this.valorBebida = valorBebida;
        setPorcenForService(10);
    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void setPorcenForService(int x) {
        this.porcenForService = (valorInicialMenu * x) / 100;
    }

    public double getValorGuarnicion() {
        return valorGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getPorcenForService() {
        return porcenForService;
    }

    @Override
    public String toString() {
        String cadena = String.format(">>>>>>>> Menu de la Carta <<<<<<<<\n"
                + "%s>\tValor de Guarnición %.2f\n"
                + ">\tValor  de Bebida: %.2f\n"
                + ">\tValor Adicional por Servicio: %.2f\n"
                + ">\tValor total del menu: %.2f\n",
                super.toString(),
                getValorGuarnicion(),
                getValorBebida(), getPorcenForService(), getValorMenu());

        return cadena;
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = valorGuarnicion + valorBebida + porcenForService;
    }
    
}
