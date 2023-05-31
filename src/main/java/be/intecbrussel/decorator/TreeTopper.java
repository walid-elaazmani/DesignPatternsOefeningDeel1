package be.intecbrussel.decorator;

public class TreeTopper extends TreeDecorator{
    public TreeTopper(ChristmasTree christmasTree) {
        super(christmasTree);
    }
    @Override public String decorate(){
        return  super.decorate() + " + Topper";
    }
}
