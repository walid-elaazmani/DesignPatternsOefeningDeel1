package be.intecbrussel.decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree christmasTree;
    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }
}
