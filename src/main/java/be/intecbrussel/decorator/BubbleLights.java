package be.intecbrussel.decorator;

public class BubbleLights extends TreeDecorator{
    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override public String decorate(){
        return "Tree has Bubble lights";
    }
}
