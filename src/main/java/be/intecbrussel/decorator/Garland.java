package be.intecbrussel.decorator;

public class Garland extends TreeDecorator{
    public Garland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override public String decorate(){
        return super.decorate() + " + Garlands";
    }
}
