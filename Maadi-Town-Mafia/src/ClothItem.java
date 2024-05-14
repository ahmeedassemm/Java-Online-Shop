public abstract class ClothItem {
    protected int itemId;
    private int price;
    protected String color;
    protected boolean isAvailable;
    protected static int itemsNumber;

    public ClothItem() {
        this.itemId = itemsNumber;

    }

    public boolean checkAvailablity() {
        return isAvailable;
    }

    public int getItemId() {
        return itemId;
    }

    abstract void displayinfo();

}
