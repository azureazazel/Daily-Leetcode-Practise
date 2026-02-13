import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorprac {
   
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Current value: " + value);

            if (value == 20) {
                list.remove(value);
            }
        }
    }
}
