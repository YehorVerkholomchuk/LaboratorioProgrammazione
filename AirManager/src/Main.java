import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VoloInternazionale vi = new VoloInternazionale("AZ123", LocalDate.of(2028, 12, 23), 100, "New York", "Mario Rossi", true);
        System.out.println(vi.generaTicket());
    }
}