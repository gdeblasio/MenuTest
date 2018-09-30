package menutest;

import java.util.ArrayList;

public class McDonaldsMenu {
    ArrayList menuItems;
    
    public McDonaldsMenu() {
        menuItems = new ArrayList();
        addItem("Beacon SmokeHouse Burger","Carne,tocino ahumado,cebolla,cheddar",false,3.75);
        addItem("Big Mac","Carne, pepinillo,lechuga,cheddar",false,3.90);
    }

    public void addItem(String name, String description,boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }
}
