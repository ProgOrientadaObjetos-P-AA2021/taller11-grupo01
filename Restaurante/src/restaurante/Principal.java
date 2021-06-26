/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import Menus.menuNiños;
import Menus.menuEconomico;
import Menus.menuCarta;
import Menus.MenuDia;
import MenuAbstratcta.Menu;
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
        menuNiños muniNiño1 = new menuNiños("Cangreburger", 0.50, 20.0, 10, 9);
        menuNiños muniNiño2 = new menuNiños("Papas gg", 2.30, 1.20, 8.10, 9);
        menuEconomico menuEconomic = new menuEconomico("Ceviche", 22.1, 10);
        MenuDia menuDay = new MenuDia("Caldito de Pollo", 31.1, 12.1, 12.4);
        menuCarta munuCart = new menuCarta("Caldito de Pollo", 31.1, 4.12,
                5.6, 13);
        listaMenus.add(muniNiño1);
        listaMenus.add(muniNiño2);
        listaMenus.add(menuEconomic);
        listaMenus.add(menuDay);
        listaMenus.add(munuCart);
        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).setValorMenu();// se llama al 
            // métodos abstracto
        }
        Cuenta cuenta = new Cuenta("Nixon Vuele", 12, listaMenus);
        System.out.println(cuenta);

    }
}
