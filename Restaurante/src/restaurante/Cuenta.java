/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import MenuAbstratcta.Menu;
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
        this.listadoMenu = listadoMenu;
        setSubtotal();
        setValorTotal();

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

    public void setSubtotal() {
        double suma = 0;
        for (int i = 0; i < listadoMenu.size(); i++) {
            suma = suma + listadoMenu.get(i).getValorMenu();
        }
        this.subt = suma;
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
        String cadena = String.format(">>>>>>>>> Cuenta Total a Cancelar <<<<"
                + "<<<<\n> Lista de Menus Consumidos:\n");
        for (int i = 0; i < listadoMenu.size(); i++) {
            cadena = String.format("%s%s\n", cadena,
                    listadoMenu.get(i).toString());
        }
        cadena = String.format("%s>>>>>> Cuenta del Cliente:\n\n\t"
                + "> Nombre Cliente: %s\n\t> Subtotal: %.2f$\n"
                + "\t> Iva: %d%s\n"
                + "\t> Valor Total: %.2f$\n", cadena, getNombreCliente(),
                getSubtotal(),
                getIva(), "%",
                getValorTotal());
        return cadena;
    }
}
