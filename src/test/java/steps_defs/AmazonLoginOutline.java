package steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginOutline {
    @Given("I'm on Amazon")
    public void i_m_on_amazon() {
        System.out.println("I'm on Amazon");
    }
    @Given("I'm on Amazon registration")
    public void i_m_on_amazon_registration() {
        System.out.println("\"I'm on Amazon registration");
    }
    @When("I'm enter {string}")
    public void i_m_enter(String email) {
        System.out.println("Email is" + email);
    }
    @Then("I'm should see {string}")
    public void i_m_should_see(String message) {
        System.out.println("Message is " + message);
    }

}
