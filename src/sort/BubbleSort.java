package sort;

import util.SwapUtil;

import java.util.List;

/**
 * 冒泡排序是一种交换排序，
 * 两两比较相邻记录的关键字，如果反序则交换，直到没有反序为止
 *
 *
 *
 * 冒泡排序真的比简单排序快吗？
 * 感觉不是特别明显
 */
public class BubbleSort {





    /**
     * 冒泡排序
     * Bubble Sort Begin  1560325197178
     * Bubble Sort End  1560325197182
     * [2, 3, 6, 7, 9, 9, 10, 10, 11, 13, 14, 14, 14, 17, 20, 21, 22, 22, 24, 25, 26, 26, 26, 27, 28, 28, 29, 30, 30, 31, 32, 34, 34, 35, 35, 37, 38, 38, 39, 42, 43, 44, 44, 46, 46, 46, 49, 50, 53, 56, 57, 57, 57, 59, 59, 60, 61, 61, 64, 65, 68, 69, 70, 71, 71, 74, 75, 76, 77, 78, 79, 80, 80, 81, 81, 82, 82, 82, 83, 85, 85, 86, 86, 87, 87, 89, 89, 90, 92, 92, 92, 93, 93, 95, 95, 95, 95, 98, 99, 99]
     */
    public static <T extends Integer> void bubbleSort(List<T> list) {
        int no = list.size();
        System.out.println(" Bubble Sort Begin  " + System.currentTimeMillis());
        for (int i = 0; i < no; i++) {
            for (int j = no - 2; j >= i; j--) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    SwapUtil.swapList(list, j, j + 1);
                }
            }
        }

        System.out.println(" Bubble Sort End  " + System.currentTimeMillis());
    }

    //上方两个在万级的差距不大，大概几十毫秒
    //十万级的冒泡是30多毫秒 23毫秒，感觉简单排序速度更快


    /**
     * 冒泡排序优化
     *  */
    public static <T extends Integer> void optionBubbleSort(List<T> list) {
        int no = list.size();
        System.out.println("option Bubble Sort Begin  " + System.currentTimeMillis());
        boolean flag = true;
        for (int i = 0; i < no && flag; i++) {
            flag = false;
            for (int j = no - 2; j >= i; j--) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    SwapUtil.swapList(list, j, j + 1);
                    flag = true;
                }
            }
        }

        System.out.println("option Bubble Sort End  " + System.currentTimeMillis());
    }
}
