package sort;

import java.util.List;

public class ShellSort {


    public static void shellSort(List<Integer> list) {
        int no = list.size();


        int increment = no;
        do {

            increment = increment / 5+1;//此处一定要加1，作用体现在不会直接从5直接跳到1
                                        //为5没有加1的时候顺序不对
            for (int i = increment; i < no; i++) {
                int temp;
                if (list.get(i - increment) > list.get(i)) {
                    temp = list.get(i);
                    int j = i - increment;
                    for (; j >= 0 && list.get(j) > temp; j -= increment) {
                        list.set(j+increment,list.get(j));
                    }
                    list.set(j+increment,temp);
                }

            }
        } while (increment >1);


    }


}
