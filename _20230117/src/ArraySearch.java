import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args){
        int[] ar = {1,4,2,8};
        Arrays.sort(ar);
        for(int n : ar)
            System.out.println(n);

        int idx = Arrays.binarySearch(ar,4);
        System.out.println("where 4:"+idx);
    }
}
