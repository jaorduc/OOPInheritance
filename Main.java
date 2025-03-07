
public class Main{
    public static void main(String[] args){

        System.out.println("Hi Inheritance!");
        
        Bird bird = new Bird();
        bird.fly();
        bird.chirp();


        Dog dog = new Dog();
        dog.walk();
        dog.bark();


        Fish fish = new Fish();
        fish.swims();

    }
}