package be.intecbrussel.decorator;

public class MainAppDecorator {
    public static void main(String[] args) {
        RealChristmasTree myTree = new RealChristmasTree();
        Garland garlandedTree = new Garland(myTree);


        System.out.println(myTree.decorate());
        System.out.println(garlandedTree.decorate());
    }
}
