package dojo;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Order {
    private String owner;
    private String target;
    private String message;
    private List<String> cocktails;

    public Order() {
        this.cocktails = new ArrayList<>();
    }

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void declareTarget(String target) {
        this.target = target;
    }

    public void declareMessage(String message) {
        this.message = message;
    }


    public List<String> getCocktails() {
        return cocktails;
    }

    public void addCocktail(String cocktail) {
        this.cocktails.add(cocktail);
    }
}