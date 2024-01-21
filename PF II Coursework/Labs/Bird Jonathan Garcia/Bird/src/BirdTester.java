import bird.Bird;
import bird.Duck;
import bird.Penguin;

public class BirdTester {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();
        Penguin penguin = new Penguin();

        System.out.println(bird.toString());

        System.out.println(duck.toString()); // This is a duck. It can fly. It can swim.
        System.out.println(duck.swim());
        System.out.println(duck.makeSound());

        System.out.println(penguin.toString()); // This is a penguin. It cannot fly. It can swim.
        System.out.println(penguin.swim());
        System.out.println(penguin.makeSound());
    }
}
