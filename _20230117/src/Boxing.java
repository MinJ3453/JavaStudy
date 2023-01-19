public class Boxing {
    public static void main(String[] args){
        Integer IObj = new Integer(10); //Boxing
        Double dObj = new Double(3.14);

        System.out.println(IObj);
        System.out.println(dObj);

        IObj = new Integer(IObj.intValue()+10); //UnBoxing
        dObj = new Double(dObj.doubleValue()+1.2);

        System.out.println(IObj);
        System.out.println(dObj);

    }
}
