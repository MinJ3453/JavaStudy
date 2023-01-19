import java.math.BigInteger;

public class SoBigNum {
    public static void main(String[] args){
        System.out.println("최대 정수:"+Long.MAX_VALUE);

        BigInteger big = new BigInteger("9999999999999999999999999999999"); // 최대 정수 초과
        BigInteger r1 = big.add(BigInteger.valueOf(3333333));

        System.out.println(r1);
    }
}
