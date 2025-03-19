package andrea_freddi.U5_W1_D2_J.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Item {
    protected int calories;
    protected double price;
}
