package menutest;

public class MenuTest {

    public static void main(String[] args) {
        McDonaldsMenu mcdonaldsMenu = new McDonaldsMenu();
        TelepizzaMenu telepizzaMenu = new TelepizzaMenu();
        Camarero camarero = new Camarero(mcdonaldsMenu, telepizzaMenu);
        camarero.imprimeMenu();
    }
    
}
