package sort;

import util.SwapUtil;

import java.util.List;

public class QuickSort {

    public static void quickSort(List<Integer> list) {
        recursion(list, 0, list.size() - 1);
    }

    private static void recursion(List<Integer> list, int start, int end) {
        if (start < end) {
            int pivotIndex = divide(list, start, end);

            recursion(list, start, pivotIndex - 1);
            recursion(list, pivotIndex + 1, end);
        }
    }

    private static int divide(List<Integer> list, int start, int end) {
        int l = start, r = end;
        int temp = list.get(start);
        while (l < r) {
            while (l < r && list.get(r) >= temp)
                r--;
            if (l != r)
                SwapUtil.swapList(list, l, r);

            while (l < r && list.get(l) <= temp)
                l++;
            if (l != r)
                SwapUtil.swapList(list, l, r);
        }

        return l;
    }


}
