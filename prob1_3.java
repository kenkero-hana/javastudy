public class prob1_3{
    public static void main(String args[]){
        probclass1_3 s1, s2;
        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;

        System.out.println("たて：" + a);
        System.out.println("よこ：" + b);

        s1 = new probclass1_3(a,b);

        if(s1 == 1 ){
            System.out.println("■")；
        }
        //square(a, b);
    }
}