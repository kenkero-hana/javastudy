public class problemex1_4{
    public static void main(String args[]){
        Counter c1,c2;
        int total;
        c1 = new Counter();
        c2 = new Counter();
        c1.count();
        c2.count();
        c2.count();
        c2.reset();
        c1.count();
        c1.count();
        c2.count();
        System.out.println("c1のカウント数：" + c1.getCount());
        System.out.println("c2のカウント数：" + c2.getCount());

        total = getTotalCount(c1.getCount(), c2.getCount());

        System.out.println("トータルカウント数："+ total);
    }

    static int getTotalCount(int a, int b){
        int totalCount = 0;

        totalCount = a + b;

        return totalCount;
    }
}