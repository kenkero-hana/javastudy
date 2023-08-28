public class TabetPC extends Computer{
    public TabetPC(){
        super("タブレットPC");
    }

    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }

    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }

    public void communication(){
        System.out.println("インターネットで通信");
    }
}