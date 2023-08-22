public class probemex1_1{
    public static void main(String args[]){
        int a = (int)(Math.random()* 10) + 1;
        int b = (int)(Math.random()* 10) + 1;
        int result = add(a,b);
        int lot    = sub(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + "=" + result);
        System.out.println(a + " - " + b + "=" + lot);
    }

    // 足し算
    static int add(int a,int b){
        return a + b;
    }

    // 引き算
    static int sub(int a,int b){
        return a - b;
    }
}