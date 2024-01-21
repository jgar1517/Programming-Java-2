package bird;

public class Bird {
    private String name;

    private boolean fly;

    private boolean swim;

    //Implement constructors / use no-args constructor
    public Bird() {
        name = "bird";
        fly = true;
        swim = false;

    }
    //parameterized constructor sets the values passed into the constructor
    public Bird(String name, boolean fly, boolean swim) {
        this.name = name;
        this.fly = fly;
        this.swim = swim;
    }
    //setter methods set appropriate field to the passed in values
    public void setName(String name) {
        this.name = name;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public String getName(){
        return name;
    }

    // getter methods return te appropriate field

    public boolean canFly() {
        return fly;
    }

    public boolean canSwim(String s) {
        return swim;
    }

    //toString method to return a String indicating the state of the bird.Bird object
    @Override
    public String toString() {
        String state = "This is a " + name + ".\n";

        //if-else statements to indicate if object can or cannot fly or swim

        if (fly)
        state += "It can fly.\n";
        else
            state += "It cannot fly.\n";

        if (swim)
            state += "It can swim.\n";
        else
            state += "It cannot swim.\n";

        return state;
    }
}
