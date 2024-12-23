package Model;

public class Item {
    private String itemId;
    private String itemName;
    private int Quantity;
    private double price;
    private String item_Description;

    public Item() {
    }

    public Item(String itemId, String itemName, int quantity, double price, String item_Description) {
        this.itemId = itemId;
        this.itemName = itemName;
        Quantity = quantity;
        this.price = price;
        this.item_Description = item_Description;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItem_Description() {
        return item_Description;
    }

    public void setItem_Description(String item_Description) {
        this.item_Description = item_Description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", Quantity=" + Quantity +
                ", price=" + price +
                ", item_Description='" + item_Description + '\'' +
                '}';
    }
}
