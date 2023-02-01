package coffeeMachine;

public class CoffeeMachine {
    public static void main(String[] args) {
        InterfaceCoffe latte = new Latte();
        InterfaceCoffe americano = new Americano();

        latte.brew();
        System.out.println("");
        americano.brew();
    }
}
