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
public class menuEconomico extends menu{
    private double porcentaje;
    
    public  menuEconomico(double p){
        porcentaje = p;
    }
    public void setPorcentajeDescuento(double pro){
        porcentaje = pro;
    }
    
    public double getPorcentajeDescuento(){
        return porcentaje;
    }
    
}
