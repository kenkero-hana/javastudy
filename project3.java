import java.util.*;

public class project3{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        int a;
        int temp;
        
        for(int i = 0; ;i++){
            a = (int)(Math.random()* 100);
            System.out.println("0〜100の値を出力：" + a);
            al.add(a);
            if(a == 0){
                break;
            }
            //System.out.println(al + " ");
        }

        for(int i = 0; ; i++){
            System.out.print("一の位が" + i + ":");
            
        }
    }
}