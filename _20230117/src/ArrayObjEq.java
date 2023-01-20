import java.util.Arrays;

class Num{
    private int num;
    public Num(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.num == ((Num)obj).num)
            return true;
        else
            return false;

    }

    public void showInfo() {
        System.out.println(num);
    }

}

public class ArrayObjEq {

    public static void main(String[] args){
        Num[] ar1 = new Num[2];
        Num[] ar2 = new Num[2];

        ar1[0] = new Num(1);
        ar1[1] = new Num(2);
        ar2[0] = new Num(1);
        ar2[1] = new Num(2);

        for(Num num : ar1) {
            num.showInfo();
        }

        for(Num num : ar2) {
            num.showInfo();
        }

        System.out.println(Arrays.equals(ar1,ar2)); //true
    }

}
