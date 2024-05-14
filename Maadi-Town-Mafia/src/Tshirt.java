public class Tshirt extends ClothItem implements Returnable {
    private String SleeveLength, TshirtSize;

    public Tshirt(String SleeveLength, String TshirtSize) {
        this.SleeveLength = SleeveLength;
        this.TshirtSize = TshirtSize;
        this.isAvailable = itemsNumber > 0 ? true : false;
        itemsNumber++;

    }

    public void SetSleeveLength(String SleeveLength) {
        this.SleeveLength = SleeveLength;
    }

    public String GetSleeveLength() {
        return SleeveLength;
    }

    public void SetTshirtSize(String TshirtSize) {
        this.TshirtSize = TshirtSize;
    }

    public String GetTshirtSize() {
        return TshirtSize;
    }

    public void returnItem() {
        // object Id +1 As it Returns To the store
        itemsNumber++;
    }

    public void displayinfo() {
        System.out.println("The Tshirt Type is " + SleeveLength + ", and its Size is " + TshirtSize + " id: " + itemId);
    }
}
