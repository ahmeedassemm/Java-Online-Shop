public class Accessories extends ClothItem {
    private String AccessoriesType;

    Accessories(String AccessoriesType) {
        this.AccessoriesType = AccessoriesType;
    }

    void SetAccessoriesType(String AccessoriesType) {
        this.AccessoriesType = AccessoriesType;
    }

    String GetAccessoriesType() {
        return AccessoriesType;
    }

    void returnItem() {
        // object Id +1 As it Returns To the store
        itemsNumber++;
    }

    void displayinfo() {
        System.out.println("The Accessories Type is " + AccessoriesType);
    }
}
