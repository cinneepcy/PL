#include <iostream>
using namespace std;

class Animal {
public:
    Animal() { cout << "Create Animal\n"; }
    virtual ~Animal() { cout << "Delete Animal\n"; }
    virtual void sound() { cout << "Animal makes a sound\n"; }
};

class Dog : public Animal {
public:
    Dog() { cout << "Create Dog\n"; }
    ~Dog() { cout << "Delete Dog\n"; }
    void sound() override { cout << "Dog barks\n"; }
};

class Cat : public Animal {
public:
    Cat() { cout << "Create Cat\n"; }
    ~Cat() { cout << "Delete Cat\n"; }
    void sound() override { cout << "Cat meows\n"; }
};

int main() {
    Animal a;
    a.sound();

    Dog d;
    d.sound();

    Cat c;
    c.sound();

    return 0;
}
