package be.intecbrussel.factory;

import java.util.NoSuchElementException;

public class ComputerFactory {
    public static Computer computer(String type, String ram, String cpu, String hdd) {
        type = type.toLowerCase();

        switch(type){
            case "pc":
                return new PC(ram, cpu, hdd);
            case "server":
                return new Server(ram, cpu, hdd);
            default:
                throw new NoSuchElementException("Invalid input");
        }
    }
}
