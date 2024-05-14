public class Pants extends ClothItem implements Returnable {
    private String PantsType;
    private int PantsSize;

    Pants(String PantsType, int PantsSize) {
        this.PantsType = PantsType;
        this.PantsSize = PantsSize;
        this.isAvailable = itemsNumber > 0 ? true : false;
    }

    void SetPantsType(String PantsType) {
        this.PantsType = PantsType;
    }

    String GetPantsType() {
        return PantsType;
    }

    void SetPantsSize(int PantsSize) {
        this.PantsSize = PantsSize;
    }

    int GetPantsSize() {
        return PantsSize;
    }

    public void returnItem() {
        // object Id +1 As it Returns To the store
        itemsNumber++;
    }

    void displayinfo() {
        System.out.println("The Pants Type is " + PantsType + ", and its Size is " + PantsSize);
    }
}
