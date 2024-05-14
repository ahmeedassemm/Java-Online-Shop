public class Jacket extends ClothItem implements Returnable {
    private String JacketType, JacketSize;

    public Jacket(String JacketType, String JacketSize) {
        this.JacketType = JacketType;
        this.JacketSize = JacketSize;
        this.isAvailable = itemsNumber > 0 ? true : false;
    }

    void SetJacketType(String JacketType) {
        this.JacketType = JacketType;
    }

    public String GetJacketType() {
        return JacketType;
    }

    void SetJacketSize(String JacketSize) {
        this.JacketSize = JacketSize;
    }

    String GetJacketSize() {
        return JacketSize;
    }

    public void returnItem() {
        // object Id +1 As it Returns To the store
        itemsNumber++;
    }

    void displayinfo() {
        System.out.println("The Jacket Type is " + JacketType + ", and its Size is " + JacketSize + " id: " + itemId
                + " Color " + color);
    }
}
