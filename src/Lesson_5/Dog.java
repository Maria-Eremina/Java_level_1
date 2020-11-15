package Lesson_5;

public class Dog extends Animal {
    int swimLimits;
    public Dog(String name, int runLimits, float jumpOverLimits, int swimLimits) {
        super(name, runLimits, jumpOverLimits);
        this.swimLimits = swimLimits;
    }

    public void swim() {
        System.out.println( name + " swim" + " " + swimLimits + "m" );
    }


}
