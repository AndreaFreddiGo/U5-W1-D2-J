package andrea_freddi.U5_W1_D2_J.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Drink extends Item {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}


