class Animal{
    public Animal(){
        System.out.println("Create Animal");
    }
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Create Dogs");
    }
    void sound(){
        System.out.println("Dogs barks");
    }
}

public class oop{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();
        d.sound();
    }
}
