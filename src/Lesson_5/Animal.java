package Lesson_5;

public abstract class Animal {
    protected String name;
    protected int runLimits;
    protected float jumpOverLimits;

    public Animal(String name,int runLimits,float jumpOverLimits) {
        this.name = name;
        this.runLimits = runLimits;
        this.jumpOverLimits =jumpOverLimits;


    }

    public void run(){
        System.out.println(name + " " + " run" + " "+ runLimits +"m" );
    }
    public void jumpOver(){
        System.out.println(name + " jump over" + " " + jumpOverLimits + "m" );

    }

}

