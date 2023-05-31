package be.intecbrussel.factory;

public class Server extends Computer{
    public Server(String ram, String cpu, String hdd) {
        super(ram, cpu, hdd);
    }

    @Override
    public String toString() {
        return "Server{}";
    }
}
