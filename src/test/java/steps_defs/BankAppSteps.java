package steps_defs;

import com.digital_nomads.javaFall2021.applications.DemirBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Type;
import java.util.List;

public class BankAppSteps {
    DemirBank demirBank;
    @Given("user should register to bank with following data")
    public void user_should_register_to_bank_with_following_data(io.cucumber.datatable.DataTable dataTable) throws Exception {
        List<List<String>> list = dataTable.asLists((Type) String.class);
        long accNum = Long.parseLong(list.get(1).get(0));
        long routNum = Long.parseLong(list.get(1).get(1));
        demirBank = new DemirBank(accNum,routNum);
    }
    @Then("user should be successfully registered the bank with following data")
    public void user_should_be_successfully_registered_the_bank_with_following_data(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> list = dataTable.asLists((Type) String.class);

        long expectedAccNum = Long.parseLong(list.get(1).get(0));
        long expectedRoutingNum = Long.parseLong(list.get(1).get(1));

        long actualAccNum = demirBank.getAccountNumber() + 1;
        long actualRoutingNum = demirBank.getRoutingNumber();

        Assertions.assertEquals(expectedAccNum, actualAccNum);
        Assertions.assertEquals(expectedRoutingNum, actualRoutingNum);

    }

}
