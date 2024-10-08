class Animal:
    def __init__(self):
        print("Create Animal")
    def __del__(self):
        print("Delete Animal")
    def sound(self):
        print("Animal makes a sound")
        
class Dog(Animal):
    def __init__(self):
        super().__init__()
        print("Create Dog")
    def __del__(self):
        print("Delete Dog")
    def sound(self):
        print("Dog barks")
    
class Cat(Animal):
    def __init__(self):
        super().__init__()
        print("Create Cat")
    def __del__(self):
        print("Delete Cat")
    def sound(self):
        print("Cat meows")
        
a = Animal()
a.sound()
print("\n")
d = Dog()
d.sound()
print("\n")
c = Cat()
c.sound()
