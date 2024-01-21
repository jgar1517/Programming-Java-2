public class Item {
    //
    protected String name;
    protected int quantity;

    //implement the constructor
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    //implement the getters
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }

    //Implement the methods increaseQuantity and decreaseQuantity
    public void increaseQuantity(int qty){
        quantity = quantity + qty;
    }

    public void decreaseQuantity(int qty){
        quantity = quantity - qty;

    }
    // implement toString and return state of name and quantity
    public String toString() {
        return "This is a(n) " + name + ". You have " + quantity + " of these.";
    }

}
