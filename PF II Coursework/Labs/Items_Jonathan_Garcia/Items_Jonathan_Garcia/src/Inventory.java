import java.util.ArrayList;

//abstract class because ItemInventory class will be calling on the Arraylist from this class
public abstract class Inventory {
    protected ArrayList<Item> list;

    //implement the getItem method to locate the item in the Array list passing through the index
    public Item getItem (int index) {
        return list.get(index);
    }
    ////implement the removeItem method to locate item and decrease its quanitity by the amount of "qty"
    // //Then remove from the list if the quantity equals (==) zero
    public void removeItem(int index, int qty){
        list.get(index).decreaseQuantity(qty);
        if(list.get(index).getQuantity() == 0)
            list.remove(index);
    }
    //implement the addItem as an abstract method to be used by the ItemInventory class
    public abstract void addItem(Item item);

}
