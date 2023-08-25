public class FighterAiracraft{
    // ひこうタイプ
    private String type = "戦闘機";
    // タイプの取得
    public String getType(){
        return type;
    }
    // 飛行する
    public void fly(){
        super("攻撃に出るために飛行します");
    }
    // 戦闘する
    public void fight(){
        System.out.println("戦闘します");
    }
}