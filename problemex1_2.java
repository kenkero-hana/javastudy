public class problemex1_2{
    public static void main(String args[]){
        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;
        int c ;
        int result = mul(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + "*" + b + "=" + result);
    }
    // 掛け算
    static int mul(int a, int b){
        return a * b;
    }
}