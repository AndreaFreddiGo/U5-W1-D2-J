package andrea_freddi.U5_W1_D2_J.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private int numTable;
    private int numMaxCoperti;
    private boolean isFree;
    private double costoCoperto;

    private void printTable() {
        System.out.println("numero tavolo--> " + numTable);
        System.out.println("numero massimo coperti--> " + numMaxCoperti);
        System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
    }
}
