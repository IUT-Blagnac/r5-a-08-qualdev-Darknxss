package dojo;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy {int} cocktails")
    public void who_wants_to_buy_a_drink(String string, int number) {
        this.order = new Order();
        this.order.declareOwner(string);

    for (int i = 0; i < number; i++) {
        this.order.addCocktail("newCocktail");
    }

    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String string) {
        this.order.declareTarget(string);
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String string) {
        this.order.declareMessage(string);
    }


    @Then("there is {int} cocktail in the order")
    public void there_is_cocktail_in_the_order(int number) {
        List<String> cocktails = order.getCocktails();
        assertEquals(number, cocktails.size());
    }
}

