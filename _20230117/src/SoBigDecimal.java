import java.math.BigDecimal;

public class SoBigDecimal {
    public static void main(String[] args){

        Double d1 = 1.6;
        System.out.println(d1+0.1); //1.7000000000000002 오차 존재

        BigDecimal d = new BigDecimal("1.6");
        System.out.println("덧셈 :"+d.add(BigDecimal.valueOf(1.8))); //덧셈 :3.4


    }
}
