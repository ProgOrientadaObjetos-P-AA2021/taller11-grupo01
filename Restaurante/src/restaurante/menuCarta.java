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

    public menuCarta(String nombrePlato, double valorInicialMenu) {
        super(nombrePlato, valorInicialMenu);

    }

    public void setValorGuarnicion(double valorGuarnicion) {
        this.valorGuarnicion = valorGuarnicion;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void setPorcenForService(double porcenForService) {
        this.porcenForService = porcenForService;
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
                + ">\tPorcentaje Adicional por Servicio: %.2f\n",
                super.toString(),
                getValorGuarnicion(),
                getValorBebida(), getPorcenForService());

        return cadena;
    }

    @Override
    public void setValorMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
