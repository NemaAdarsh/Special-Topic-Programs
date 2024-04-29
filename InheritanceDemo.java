class Animal  //animal class is superclass, it has eat, if something doesnt have eat (dog) animal eat will come
{
    void eat()
	{
        System.out.println("Animal eats");
    }
}

class Cat extends Animal
{
	void eat()
	{
        System.out.println("Cat eats");
    }

	void meow()
	{
		System.out.println("meow");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("bark");
	}
}

public class InheritanceDemo
{
    public static void main(String[] args)
	{
        Animal animal=new Animal();
        animal.eat();
        Cat cat = new Cat();
        cat.eat(); //this will say cat eats not animal eats because not superimposed
        cat.meow();
        Dog dog = new Dog();
        dog.eat(); //inherited from superclass
        dog.bark();
    }
}