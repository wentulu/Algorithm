import sort.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 20; i++)
            list.add(random.nextInt(300));
        QuickSort.quickSort(list);
        System.out.println(list);

    }
}
