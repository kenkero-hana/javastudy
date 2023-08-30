import java.util.*;

public class SampleClassEx503{
    public static void main(String args[]){
        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("ONE");
        s1.add("TWO");
        s1.add("THREE");

        for(String s:s1){
            System.out.print(s + " ");
        }
        System.out.println();

        ArrayList<Integer> il = new ArrayList<Integer>();
        il.add(1);
        il.add(2);
        il.add(3);

        for(Integer i: il){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}