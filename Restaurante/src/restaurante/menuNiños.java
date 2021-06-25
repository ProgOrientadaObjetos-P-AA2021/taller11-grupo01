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
public class menuNiños  extends menu{
    private double porHelado;
    private double pastel;
    
    public menuNiños(double he,double pa){
        porHelado = he;
        pastel = pa;
        
    }
    public void setValorPorcionPatel(double a){
        pastel = a;
        
    }
    public void setValorPorcionHelado(double s){
        porHelado = s;
    } 
    
    public double getValorPorcionHelado(){
        return porHelado;
    }
    public double getValorPorcionPatel(){
        return pastel ;
    }
    
}
