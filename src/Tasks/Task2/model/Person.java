package src.tasks.task2.model;

public class Person {
    String fullName;
    int age;

    public Person(){
        fullName = "Tom";
        age = 25;
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.printf("%s говорит: ", fullName);
    }

    public void talk(){
        System.out.printf("%s говорит: ", fullName);
    }
}
