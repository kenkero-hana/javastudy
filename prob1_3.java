public class prob1_3{
    public static void main(String args[]){
        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;

        System.out.println("たて：" + a);
        System.out.println("よこ：" + b);

        square(a, b);
    }
    static int square(int a, int b){
        int i;
        int j;

        for(i = 0; i < a; i++){
            for(j = 0; j < b; j++){
                if(i < 0 && j < 0){
                    System.out.println("");
                }else{
                    System.out.print("■ ");
                }
            }
            System.out.println();
        }
        return 0;
    }
}