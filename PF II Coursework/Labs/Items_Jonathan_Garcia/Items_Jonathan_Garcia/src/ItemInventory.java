import java.util.ArrayList;

//class extends Inventory class and call on the ArrayList "list", and addItem method
public class ItemInventory extends Inventory {

    //calls on Arraylist from Inventory class
    public ItemInventory() {
        list = new ArrayList<Item>();
    }

    //implement the addItem method and declare a boolean to keep track of whether a new item is being added or not
    public void addItem(Item item){
        boolean uniqueItem = true;
    //Use a for loop to step through each item in the list
        for (int index = 0; index < list.size(); index ++){
            if (list.get(index).getName().equals(item.getName())){
                uniqueItem = false;
                list.get(index).increaseQuantity(item.getQuantity());

            }
        }
        //if statement will check if boolean is true or false and add the item (uniqueItem) to the list if it is a new item
        if (uniqueItem)
            list.add(item);
    }

}