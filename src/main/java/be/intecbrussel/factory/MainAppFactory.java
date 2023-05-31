package be.intecbrussel.factory;

public class MainAppFactory {
    public static void main(String[] args) {
        Computer a = ComputerFactory.computer("pc", "5", "8", "9");
        System.out.println(a);


    }
}
