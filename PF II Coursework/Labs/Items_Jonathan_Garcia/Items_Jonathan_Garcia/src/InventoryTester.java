public class InventoryTester {
    public static void main(String[] args) {
        ItemInventory itemInv = new ItemInventory();

        itemInv.addItem(new Item("potion", 10));
        itemInv.addItem(new Item("elixer", 6));
        itemInv.addItem(new Item("antidote", 2));
        itemInv.addItem(new Item("potion", 5));

        itemInv.removeItem(1, 2);

        for (int index = 0; index < 3; index++) {
            System.out.println(itemInv.getItem(index));
        }

		/* Expected output:

		This is a(n) potion. You have 15 of these.
		This is a(n) elixer. You have 4 of these.
		This is a(n) antidote. You have 2 of these.

		*/
    }
}
