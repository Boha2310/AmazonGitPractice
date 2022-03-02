package steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class DataTableSteps {

    @Given("User is on NambaFood")
    public void user_is_on_namba_food() {
        System.out.println("User is on NambaFood");
    }
    @When("User clicks on Foods")
    public void user_clicks_on_foods() {
        System.out.println("User clicks on Foods");
    }
    @Then("User should see {string}")
    public void user_should_see(String string) {
        System.out.println("User should see " + string);
    }
    @Then("User should find Sushi category")
    public void user_should_find_sushi_category() {
        System.out.println("User should find Sushi category");
    }
    @When("User click on Sushi")
    public void user_click_on_sushi() {
        System.out.println("User click on Sushi");
    }
    @Then("User should see list of cafes")
    public void user_should_see_list_of_cafes() {
        System.out.println("User should see list of cafes");
    }
    @Then("User should scrool down the page to Arigato cafe")
    public void user_should_scrool_down_the_page_to_arigato_cafe() {
        System.out.println("User should scrool down the page to Arigato cafe");
    }
    @When("User click on Arigato")
    public void user_click_on_arigato() {
        System.out.println("User click on Arigato");
    }
    @Then("User should see Arigato menu")
    public void user_should_see_arigato_menu() {
        System.out.println("User should see Arigato menu");
    }
    @Then("User should find Kimchi")
    public void user_should_find_kimchi() {
        System.out.println("User should find Kimchi");
    }
    @When("User increase Kimchi amount to {int}")
    public void user_increase_kimchi_amount_to(Integer int1) {
        System.out.println("User increase Kimchi amount to " + int1);
    }
    @When("User should click on Order button")
    public void user_should_click_on_order_button() {
        System.out.println("User should click on Order button");
    }
    @Then("on the cart user shouls see {string}")
    public void on_the_cart_user_shouls_see(String string) {
        System.out.println("on the cart user shouls see " + string);
    }


    // Second scenario

    @Given("User is on {string}")
    public void user_is_on(String url) {
        System.out.println("User is on " + url);
    }
    @Then("Following menu bar should be displayed on Home page")
    public void following_menu_bar_should_be_displayed_on_home_page(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> data = dataTable.asLists((Type) String.class);
        System.out.println(data.get(0).get(1));
        String java = data.get(2).get(2);
        System.out.println(java);
    }

}
