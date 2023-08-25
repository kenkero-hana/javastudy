public class problenex2_1{
    public static void main(String args[]){
        Fighter f = new Fighter();
        Airplane a = new Airplane();
        // 飛行機が飛行する
        a.fly();
        // 戦闘機が飛行する
        f.fly();
        // 戦闘機が戦闘する
        f.fight();
    }
}