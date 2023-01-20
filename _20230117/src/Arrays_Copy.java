import java.util.Arrays;

public class Arrays_Copy {
    public static void main(String[] args){
        String[] arOrg = {"hello","world","apple"};
        String[] arCpy = Arrays.copyOf(arOrg,arOrg.length); // 전체 복사

        for(String d : arCpy)
            System.out.println(d+"\t");
    }
}
