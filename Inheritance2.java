class Animal
{
    void eat(){
        System.out.println("Eating");
    }
}

class dog extends Animal
{
    void bark()
    {
        System.out.println("Barking");
    }
}

class cat extends Animal
{
    void meow()
    {
        System.out.println("Meowing");
    }
}

public class Inheritance2
{
    public static void main(String[] args) {
        cat c = new cat();
        c.meow();
        //c.bark(); both are at the same hierachical level so cannot use that method
        c.eat();

        dog d= new dog();
        //d.meow(); both are at the same hierachical level so cannot use that method
        d.bark();
        d.eat();


    }
}