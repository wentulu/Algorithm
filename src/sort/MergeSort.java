package sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 归并排序
 */
public class MergeSort {


    public static void mergeSort(List<Integer> list) {
        divide(list, 0, list.size() - 1);
    }

    private static void divide(List<Integer> list, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;
            divide(list, left, mid);

            divide(list, mid+1, right);

            merge(list, left, mid, mid + 1, right);

        }

    }

    private static void merge(List<Integer> list, int startL, int endL, int startR, int endR) {
        List<Integer> tempList = new ArrayList<>();
        int ls = startL;
        int rs = startR;
        while (ls <= endL && rs <= endR) {
            if (list.get(ls) <= list.get(rs)) {
                tempList.add(list.get(ls));
                ls++;
            }
            if (list.get(rs) <= list.get(ls)){
                tempList.add(list.get(rs));
                rs++;
            }
        }

        while (ls<= endL){
            tempList.add(list.get(ls));
            ls++;
        }
        while (rs<=endR){
            tempList.add(list.get(rs));
            rs++;
        }
        for (int j = startL; j<=endR;j++){
            list.set(j,tempList.get(j-startL));
        }
    }


}
