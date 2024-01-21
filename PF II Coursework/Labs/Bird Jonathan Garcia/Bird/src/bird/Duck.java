package bird;

import bird.Bird;

//extends the bird.Bird class and inherits the fields and methods from the bird.Bird class
public class Duck extends Bird {
    //no-args constructor
    public Duck() {
        super("duck", true, true);

    }
    //implement the swim method to return the String
    public String swim() {return "The duck swims in the everglades.";}

    //implement the makeSOund method to return the String
    public String makeSound() {
        return "Quack quack!\n";
    }
}
