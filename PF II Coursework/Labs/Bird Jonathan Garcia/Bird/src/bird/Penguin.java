package bird;

import bird.Bird;

public class Penguin extends Bird {

    //no-args constructor/ initializes the name to penguin and fly to false and swim to true
    public Penguin(){
        super("penguin", false, true);
    }
    //implement the swim method to return the String
    public String swim(){return "The penguin swims in the arctic.";}

    //implement the makeSOund method to return the String
    public String makeSound(){
        return "Whek whek!";
    }
}
