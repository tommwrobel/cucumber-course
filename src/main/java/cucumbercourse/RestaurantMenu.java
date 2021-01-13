package cucumbercourse;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    List<RestaurantMenuItem> menuItems;

    public RestaurantMenu() {
        menuItems = new ArrayList<>();
    }

    public boolean addItem(RestaurantMenuItem restaurantMenuItem) {
        if(menuItemExists(restaurantMenuItem)) {
            throw new IllegalArgumentException("Menu item named " + restaurantMenuItem.getName() + " already exists!");
        }
        return menuItems.add(restaurantMenuItem);
    }

    public List<RestaurantMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<RestaurantMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    private boolean menuItemExists(RestaurantMenuItem restaurantMenuItem) {
        return menuItems.contains(restaurantMenuItem);
    }
}
