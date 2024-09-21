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
        System.out.println("Create Dog");
    }
    
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    public Cat(){
        System.out.println("Create Cat");
    }
    
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}


public class oop{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}
