import java.util.*;

public class project2{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int a;
        int temp;
        
        for(int i = 0; ;i++){
            a = (int)(Math.random()* 10);
            System.out.println("0〜10の値を出力：" + a);
            al.add(a);
            if(a == 0){
                break;
            }
            //System.out.println(al + " ");
        }

        for(int number = al.size() -1; number >=0; number--){
            
            System.out.print(al.get(number) + " ");
        }
        System.out.println();
    }
}