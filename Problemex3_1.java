public class Problemex3_1{
    public static void main(String args[]){
        // 戦闘機クラスのインスタンスの生成
        FighterAiracraft fighter = new FighterAiracraft();
        PassengerPlane airlinear = new PassengerPlane();
        // 戦闘機クラスの処理
        fighter.fly();
        fighter.fight();
        // 旅客機クラスの処理
        airlinear.fly();
        airlinear.carryPassengers();
    }
}