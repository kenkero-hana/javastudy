public abstract class Bird{
    // 名前フィールド
    private String name;
    // 引数つきコンストラクタ
    Bird(String name){
        this.name = name;
    }
    // 名前を取得
    public String getname(){
        return name;
    }
    // naku
    abstract void sing();
}