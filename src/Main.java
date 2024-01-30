import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> filteredList = new ArrayList<>();

        for (Integer number : intList) {
            if (number > 0 && number % 2 == 0) {
                filteredList.add(number);
            }
        }

        Collections.sort(filteredList);

        for (Integer number : filteredList) {
            System.out.println(number);  // 2, 4, 8, 16, 32
        }

    }
}