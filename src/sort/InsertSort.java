package sort;

import java.util.List;

public class InsertSort {


    public static void insertSort(List<Integer> list) {

        int no = list.size();

        int temp;
        for (int i = 1; i < no; i++) {
           if (list.get(i-1)>list.get(i)){
               temp = list.get(i-1);
               int j;
               for ( j= i-1; list.get(j)>temp;j--){
                   list.set(j+1,list.get(j));
               }
               list.set(j+1,temp);
           }
        }

    }


}
