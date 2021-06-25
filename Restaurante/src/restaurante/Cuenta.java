/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Cuenta {

    private String nombreCl;
    private ArrayList<Menu> listadoMenu;
    private double valTotal;
    private double subt;
    private int iva;

    public Cuenta(String nombreCl, int iva, ArrayList<Menu> listadoMenu) {
        this.nombreCl = nombreCl;
        this.listadoMenu = listadoMenu;
        this.iva = iva;

    }

    public void setNombreCliente(String n) {
        nombreCl = n;

    }

    public void setListadoCartas(ArrayList<Menu> l) {
        listadoMenu = l;
    }

    public void setValorTotal() {
        valTotal = ((subt * iva) / 100) + subt;
    }

    public void setSubtotal(double s) {
        for (int i = 0; i < listadoMenu.size(); i++) {
            
        }
    }

    public void setIva(int iv) {
        iva = iv;
    }

    public String getNombreCliente() {
        return nombreCl;
    }

    public ArrayList<Menu> getListadoCartas() {
        return listadoMenu;
    }

    public double getValorTotal() {
        return valTotal;
    }

    public double getSubtotal() {
        return subt;
    }

    public int getIva() {
        return iva;
    }

    @Override
    public String toString() {
        String cadena = String.format(">>>>>>>> Cuenta <<<<<<<<\n"
                + "%s>\tNombre Cliente: %s\n"
                + ">\tlista del menu: %s\n"
                + ">\tValor Total:%.2f\n"
                + ">\tSubtotal:\n"
                + ">\tIva: \n",
                super.toString(),
                getNombreCliente(),
                getListadoCartas(),
                getValorTotal(),
                getSubtotal(),
                getIva());

        return cadena;
    }
}
