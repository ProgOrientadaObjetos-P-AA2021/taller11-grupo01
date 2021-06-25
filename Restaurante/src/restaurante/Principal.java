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
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> listaMenus = new ArrayList<>();

        /*Dos objetos de tipo menú de niños
Un objeto de tipo menú de económico
 Un objeto de tipo menú del día
Un objeto de tipo menú a la carta.
Un objeto de tipo Cuenta (con datos iniciales como: nombre del cliente, IVA, listado de cartas -menú-.*/
        MenuNiños muniNiño1 = new MenuNiños(0.50, 1);
        MenuNiños muniNiño2 = new MenuNiños(2.30, 3);
        menuEconomico menuEconomic = new menuEconomico(22.1);
        MenuDia menuDay = new MenuDia("Caldito de Pollo", 31.1,12.1,12.4);
        menuCarta munuCart = new menuCarta("Caldito de Pollo", 31.1);

        listaMenus.add(muniNiño1);
        listaMenus.add(muniNiño2);
        listaMenus.add(menuEconomic);
        listaMenus.add(menuDay);
        listaMenus.add(munuCart);

        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).setValorMenu();// se llama al 
            // métodos abstracto
            System.out.println(listaMenus.get(i));
            System.out.println();
        }

    }
}
