import java.util.*;

public class project{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> bl = new ArrayList<Integer>();
        //al.add(rand1);
        int a;
        
        for(int i = 0; ;i++){
            a = (int)(Math.random()* 10);
            System.out.println("0〜10の値を出力：" + a);
            al.add(a);
            if(a == 0){
                break;
            }
            //System.out.println(al + " ");
        }

        System.out.print("偶数：");
        for(int number : al){
            if(number % 2 == 0){
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.print("奇数：");
        for(int number : al){
            if(number % 2 != 0){
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}