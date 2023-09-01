import java.util.*;

public class project{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> bl = new ArrayList<Integer>();
        //al.add(rand1);
        
        for(int i = 0; ;i++){
            int a = (int)(Math.random()* 10);
            System.out.println("0〜10の値を出力：" + a);
            if(a == 0){
                break;
            }

            if(a % 2 == 0){
                al.add(a);
            }else{
                bl.add(a);
            }
        }

        for(int i = 0; ; i++){
            
        }
    }
}