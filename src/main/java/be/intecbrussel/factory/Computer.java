package be.intecbrussel.factory;

public abstract class Computer {
    private String ram;
    private String cpu;
    private String hdd;

    public Computer(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
