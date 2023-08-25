public class SampleClassEx301{
    public static void main(String args[]){
        Crow1 c = new Crow1();
        Sparrow1 s = new Sparrow1();
        // カラスが鳴く
        System.out.print(c.getName() + ":");
        c.sing();
        // スズメがなく
        System.out.print(s.getName() + ":");
        s.sing();
    }
}