package Lesson_5;

public class MainZoo {
    public static void main(String[] args) {
        Cat t = new Cat("Triсks", 200, 2);
        Dog y = new Dog("Yuki", 500, 0.5f,10);

        Animal[] zoo = {t, y};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].run();
            zoo[i].jumpOver();
            if (zoo[i] instanceof Dog) {
                Dog dog = (Dog) zoo[i];
                dog.swim();
            }


        }
    }
}
