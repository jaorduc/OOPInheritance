
public class Main{
    public static void main(String[] args){
        System.out.println("Hi Inheritance!");
        
        Bird bird = new Bird();
        bird.fly();
        System.out.println(bird.wings);

        Dog dog = new Dog();
        dog.walk();
        System.out.println(dog.paws);

        Fish fish = new Fish();
        fish.swims();
        System.out.println(fish.fins);

    }
}