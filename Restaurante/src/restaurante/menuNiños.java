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
public class menuNiños  extends Menu{
    private double porHelado;
    private double pastel;
    
    public menuNiños( String nombrePlato, double valorInicialMenu ,double he,double pa){
        super(nombrePlato,valorInicialMenu);
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
    public double getValorPorcionPastel(){
        return pastel ;
    }
    @Override
     public String toString() {
        String cadena = String.format(">>>>>>>> Menu para niños <<<<<<<<\n"
                + "%s>\tValor Helado %.2f\n"
                + ">\tValor  de Pastel: %.2f\n",
                super.toString(),
                getValorPorcionHelado(),
                getValorPorcionPastel());

        return cadena;
    }
     @Override
    public void setValorMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
