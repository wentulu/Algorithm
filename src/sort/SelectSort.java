package sort;

import util.SwapUtil;

import java.util.List;

/**
 *
 * 简单选择排序
 *
 *通过n-i次的关键字比较，找出其中最小的与i交换
 * 这样每次i之前的都是有序的且是最终的排序
 * */
public class SelectSort {

    /**
     * 耗时9秒
     * */
    public static void selectSort(List<Integer> list){
        int no = list.size();
        System.out.println("Selection Sort Begin  "+System.currentTimeMillis());
        for (int i=0; i<no; i++){
            int min = i;
            for (int j=i+1; j<no; j++){
                if (list.get(min)>list.get(j)){
                    min = j;
                }
            }
            if (min!=i){
                SwapUtil.swapList(list,min,i);
            }
        }
        System.out.println("Selection Sort End  "+System.currentTimeMillis());
    }

}
