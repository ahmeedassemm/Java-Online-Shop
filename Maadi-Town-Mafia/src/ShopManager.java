import java.util.ArrayList;

public class ShopManager {
    private ArrayList<ClothItem> clothItems = new ArrayList<ClothItem>();
    private ArrayList<User> users = new ArrayList<User>();

    public void addItem(ClothItem item) {
        clothItems.add(item);
    }

    public void removeItem(ClothItem item) {
        clothItems.remove(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public ClothItem findItemById(int id) {
        ClothItem item;
        for (int i = 0; i < clothItems.size(); i++) {
            if (clothItems.get(i).getItemId() == id) {
                item = clothItems.get(i);
                return item;
            }
        }
        return null;
    }

    public User findUserById(int id) {
        User user;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId() == id) {
                user = users.get(i);
                return user;
            }
        }

        return null;
    }

    public void displayAllItems() {
        for (ClothItem clothitem : clothItems) {
            clothitem.displayinfo();
        }
    }

    public void displayAllUser() {
        for (User user : users) user.displayinfo();
    }

}
