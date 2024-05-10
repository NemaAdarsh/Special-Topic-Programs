class Animal
{
    public void makesound()
    {
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal
{
    public void makesound()
    {
        System.out.println("dog barks");
    }
}

class cat extends Animal
{
    public void makesound()
    {
        System.out.println("cat meow");
    }
}

public class Inheritance5
{
    public static void main(String[] args) {
        Dog d = new Dog();
        cat c = new cat();
        d.makesound();
        c.makesound();
    }
}