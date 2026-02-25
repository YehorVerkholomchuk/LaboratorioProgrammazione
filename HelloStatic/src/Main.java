import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr2.add(2);

        boolean result = Utility.confronta(arr1, arr2);
        Utility.coso = 68;
        System.out.println(result);
        System.out.println(Utility.coso);
    }
}