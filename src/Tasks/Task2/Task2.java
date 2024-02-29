package src.tasks.task2;

import src.tasks.task2.model.*;

public class task2 {

    public static void Execute() {
        Person tom = new Person();
        Person sam = new Person("Sam", 25);

        tom.move();
        sam.talk();

    }
}

