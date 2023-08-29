public class CellPhone1 implements IPhone1,IEmail1{
    // メールアドレス
    private String mailAddress;
    // 電話番号
    private String number;
    // コンストラクタ（メールアドレスと電話番号を設定）
    public CellPhone1(String mailAddress,String number){
        this.mailAddress = mailAddress;
        this.number      = number;
    }
    // 指定したメールアドレスにメールを送信する
    public void sendMail(String address){
        System.out.println(address + "に、" + this.mailAddress + "からメールが来ています");
    }
    // 指定した番号に電話をかける
    public void call(String number){
        System.out.println(number + "に、" + this.number + "から電話をかけます");
    }
}