public class Shoes extends ClothItem {
    private int ShoeSize;

    void Tshirt(int ShoeSize) {
        this.ShoeSize = ShoeSize;
    }

    void SetSShoeSize(int ShoeSize) {
        this.ShoeSize = ShoeSize;
    }

    int GetShoeSize() {
        return ShoeSize;
    }

    void returnItem() {
        // object Id +1 As it Returns To the store
        itemsNumber++;
    }

    void displayinfo() {
        System.out.println("The Shoes Size is " + ShoeSize);
    }
}
