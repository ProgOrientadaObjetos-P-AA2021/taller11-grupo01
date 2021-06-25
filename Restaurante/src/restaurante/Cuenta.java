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
public class Cuenta  {
    private String nombreCl;
    private ArrayList<menu> listadoMenu;
    private double valTotal;
    private double subt;
    private int iva;
    
    public Cuenta(String no,double val,double s, int i){
        nombreCl = no;
        valTotal = val;
        subt = s;
        iva = i;
        
    }
    public void setNombreCliente(String n){
        nombreCl = n;
        
    }
    public void setListadoCartas(ArrayList<Menu> l){
        listadoMenu = l;
    }
    public void setValorTotal(double t){
        valTotal = t;
    }
    public void setSubtotal(double s){
        subt = s;
    }
    public void setIva(int iv){
        iva = iv;
    }
    
    public String getNombreCliente(){
        return nombreCl;
    }
    public ArrayList<Menu> getListadoCartas(){
        return listadoMenu;
    }
    public double getValorTotal(){
        return valTotal;
    }
    public double getSubtotal(){
        return subt;
    }
    public int getIva(){
        return iva;
    }
    
    @Override
    public String toString(){
       String cadena = String.format("Su cuenta es:");
       
       
    }
}
