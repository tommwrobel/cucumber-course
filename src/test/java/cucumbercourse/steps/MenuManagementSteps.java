package cucumbercourse.steps;

import cucumbercourse.RestaurantMenu;
import cucumbercourse.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuManagementSteps {

    RestaurantMenuItem resturantMenuItem;
    RestaurantMenu restaurantMenu;
    List<String> errorMessages = new ArrayList<>();

    @Given("I have a menu object")
    public void iHaveAMenuObject() {
        restaurantMenu = new RestaurantMenu();
    }

    @Given("I have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String name, Integer price) {
        resturantMenuItem = new RestaurantMenuItem(name, "", price);
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        try {
            restaurantMenu.addItem(resturantMenuItem);
        } catch (IllegalArgumentException e) {
            errorMessages.add(e.getMessage());
        }
    }

    @Then("Menu item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String name) {
        assertThat(restaurantMenu.getMenuItems()).contains(resturantMenuItem);
        assertThat(resturantMenuItem.getName()).isEqualTo(name);
    }

    @Then("I get an error message {string}")
    public void iGetAnErrorMessage(String errorMessage) {
        assertThat(errorMessages).contains(errorMessage);
    }
}
