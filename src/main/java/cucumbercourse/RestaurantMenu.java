package cucumbercourse;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    List<RestaurantMenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(RestaurantMenuItem restaurantMenuItem) {
        menuItems.add(restaurantMenuItem);
    }

    public List<RestaurantMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<RestaurantMenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
