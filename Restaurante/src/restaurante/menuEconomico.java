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
public class menuEconomico extends Menu{
    private double porcentaje;
    
    public menuEconomico( String nombrePlato, double valorInicialMenu ,double p){
        super(nombrePlato,valorInicialMenu);
        porcentaje = p;
    }
    public void setPorcentajeDescuento(double pro){
        porcentaje = (valorInicialMenu *pro) /100;
    }
    
    public double getPorcentajeDescuento(){
        return porcentaje;
    }
    
    @Override
    public String toString() {
        String cadena = String.format(">>>>>>>> Menu Economico <<<<<<<<\n"
                + "%s>\tPorcentaje descuento:  %.2f\n",
                super.toString(),
                getPorcentajeDescuento());
               

        return cadena;
    }

    @Override
    public void setValorMenu() {
        this.valorMenu = valorInicialMenu + porcentaje;
    }
    
}
