package be.intecbrussel.decorator;

public class MainAppDecorator {
    public static void main(String[] args) {
        RealChristmasTree myTree = new RealChristmasTree();
        Garland garlandedTree = new Garland(myTree);
        TreeTopper tt = new TreeTopper(garlandedTree);


        System.out.println(tt.decorate());

    }
}
