public class wrapperClassMethod {
    public static void main(String[] args){
        Integer n1 = Integer.valueOf(1);
        Integer n2 = Integer.valueOf("2");

        System.out.println("더 큰 수 :"+Integer.max(n1,n2));
        System.out.println("합 :"+Integer.sum(n1,n2));
    }
}
