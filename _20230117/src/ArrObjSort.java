import java.util.Arrays;
import java.util.Objects;

class Person implements Comparable{
    private String name;
    private  int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o){
        Person p = (Person)o;
        if(this.age > p.age)
            return 1;
        else if(this.age < p.age)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString(){
        return name + ":" + age;
    }
}

public class ArrObjSort {

    public static void main(String[] args){
        Person[] ar = new Person[2];
        ar[0] = new Person("min",23);
        ar[1] = new Person("Gee",17);

        Arrays.sort(ar);

        for(Person p : ar)
            System.out.println(p);
    }
}
