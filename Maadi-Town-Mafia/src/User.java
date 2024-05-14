import java.util.ArrayList;
/**
 *
 * @author mariam ahmed
 */
public class User implements Comparable<User>{
    private int userId;
    private String name;
    private String password;
    private String email;
    private static int numberOfUsers=0;
    // private ShopItem[] clothCart;
    ArrayList<ClothItem> clothCart = new ArrayList<ClothItem>();
    private static int itemNumber = 0;

    private static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<User> getUsers(){
        return users;
    }

    public User(int id, String name, String email, String password) {
        this.userId = id;
        this.name = name;
        this.email = email;
        this.password=password;
        users.add(this);
        numberOfUsers++;
    }
    public static int getNumberOfUsers(){
        return numberOfUsers;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addItem(ClothItem clothCart) {
        this.clothCart.add(clothCart);
        itemNumber++;
    }

    public int getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public ClothItem getClothCart() {
        return this.clothCart.get(itemNumber);
    }

    public void removeItem(ClothItem item) {
        clothCart.remove(item);
        itemNumber--;
    }

    public void returnItem(Returnable item) {

    }

    public void displayinfo() {
        System.out.println("Username is " + name + " ,Email is " + email + ".");
    }
    @Override
    public int compareTo(User u){
        if((this.getUserId()==u.getUserId())){
            return 0;
        }
        else if(this.getUserId()>u.getUserId()){
            return 1;
        }
        else{
            return -1;
        }
    }
}

interface Returnable {
    void returnItem();
}