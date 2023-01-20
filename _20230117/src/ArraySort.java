import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){
        int[] ar1 = {1,5,8,9};

        Arrays.sort(ar1);

        for(int n : ar1)
            System.out.println(n);
    }
}
