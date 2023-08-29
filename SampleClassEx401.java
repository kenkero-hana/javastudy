public class SampleClassEx401{
    public static void main(String args[]){
        // 携帯電話クラスのインスタンスを生成
        CellPhone1 cp = new CellPhone1("hoge@email.com","090-1234-5678");
        // 携帯電話クラスで、電話とメールを送る
        cp.call("011-123-4567");
        cp.sendMail("hoge@email.com");
        // 電話インターフェイスでインスタンスにアクセス
        IPhone1 phone = (IPhone1)cp;
        phone.call("011-987-6543");
        // phone.sendMail("hoge@email.com");
        // メールインターフェイスでインスタンスにアクセス
        IEmail1 mail = (IEmail1)cp;
        mail.sendMail("bar@email.com");
        //mail.call("011-222-3333");
    }
}