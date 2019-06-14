package util;

import java.util.List;

public class SwapUtil {

    public static  <T> boolean swapList(List<T> list,int a, int b){
        try {
            T temp = list.get(a);
            list.set(a,list.get(b));
            list.set(b,temp);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
