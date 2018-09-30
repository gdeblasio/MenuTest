package menutest;

import java.util.ArrayList;

public class Camarero {
    McDonaldsMenu macdonaldsMenu;
    TelepizzaMenu telepizzaMenu;

    public Camarero(McDonaldsMenu macdonaldsMenu, TelepizzaMenu telepizzaMenu) {
        this.macdonaldsMenu = macdonaldsMenu;
        this.telepizzaMenu = telepizzaMenu;
    }

    public void imprimeMenu() {
        macdonaldsMenu = new McDonaldsMenu();
        ArrayList hamburguesasItems = macdonaldsMenu.getMenuItems();
        telepizzaMenu = new TelepizzaMenu();
        MenuItem[] pizzasItems = telepizzaMenu.getMenuItems(); 
        
        for (int i = 0; i < hamburguesasItems.size(); i++) {
             MenuItem menuItem = (MenuItem)hamburguesasItems.get(i);
             System.out.print(menuItem.getName() + " ");
             System.out.println(menuItem.getPrice() + " ");
             System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < pizzasItems.length; i++) {
            MenuItem menuItem = pizzasItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }        
    }
}
