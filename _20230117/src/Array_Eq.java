import java.util.Arrays;

public class Array_Eq {
    public static void main(String[] args){
        int[] ar1 = {1,2,3,4};
        int[] ar2 = Arrays.copyOf(ar1,ar1.length);

        System.out.println(Arrays.equals(ar1,ar2));
    }
}
