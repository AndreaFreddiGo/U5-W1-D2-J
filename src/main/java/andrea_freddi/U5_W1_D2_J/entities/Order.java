package andrea_freddi.U5_W1_D2_J.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private int numOrder;
    private State state;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private List<Item> orderedItems;
    private Table table;

    public Order(int numCoperti, Table table) {
        Random random = new Random();
        this.numOrder = random.nextInt(1000, 5000);
        this.state = State.IN_CORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
        this.orderedItems = new ArrayList<>();
        this.table = table;
        if (table.getNumMaxCoperti() <= numCoperti) {
            throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        }
    }

    public void addItem(Item item) {
        this.orderedItems.add(item);
    }

    public double getTotal() {
        return this.orderedItems.stream().mapToDouble(Item::getPrice).sum() + (this.table.getCostoCoperto() * this.numCoperti);
    }

    public void printOrder() {
        System.out.println("id ordine--> " + this.numOrder);
        System.out.println("stato--> " + this.state);
        System.out.println("numero coperti--> " + this.numCoperti);
        System.out.println("ora acquisizione--> " + this.oraAcquisizione);
        System.out.println("numero tavolo--> " + this.table.getNumTable());
        System.out.println("Lista: ");
        this.orderedItems.forEach(System.out::println);
        System.out.println("totale--> " + this.getTotal());
    }
}
