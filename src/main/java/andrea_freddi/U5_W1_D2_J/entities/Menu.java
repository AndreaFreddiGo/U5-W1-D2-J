package andrea_freddi.U5_W1_D2_J.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingsList;
    private List<Drink> drinksList;

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingsList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinksList.forEach(System.out::println);
        System.out.println();
    }
}
