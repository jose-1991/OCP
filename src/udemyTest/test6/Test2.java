package udemyTest.test6;

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating biscuit.");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Animal [] animals = new Dog[2];
        animals[0] = new Dog();
        animals[1] = new Dog();

        animals[0].eat();
        animals[1].eat();
    }
}
