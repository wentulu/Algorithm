package sort;

import util.SwapUtil;

import java.util.List;


/**
 * 堆排序利用了完全二叉树的 子节点index/2 = 父节点index
 *
 * 在这里注意list的下表开始是从0开始，对list操作减去1
 * */
public class HeapSort {

    public static void heapSort(List<Integer> list) {

        int no = list.size();
        int middle = no / 2;
        for (int i = middle; i > 0; i--) {
            headAdjust(list, i, no);
        }
        System.out.println("Heap" + list);

        for (int j = no ; j > 1; j--) {
            SwapUtil.swapList(list, j-1, 0);
            headAdjust(list,1,j-1);
        }
    }


    public static void headAdjust(List<Integer> list, int start, int end) {
        int j;
        int temp = list.get(start - 1);
        for (j = start * 2; j <= end; j *= 2) {
            if (j < end && list.get(j - 1) < list.get(j)) {
                ++j;
            }

            if (temp >= list.get(j - 1)) {
                break;
            }

            list.set(start - 1, list.get(j - 1));
            start = j;

        }

        list.set(start - 1, temp);
    }

}
