public class Problemex4_1{
    public static void main(String args[]){
        // 自動生成させたメソッド
        CellPhone cp = new CellPhone();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }
    // 電話としての処理
    public static void funcPhone(ICellPhone phone){
        phone.CellPhone();
        phone.recievePhone();
    }
    // メーラーとしての処理
    public static void funcMailer(IMailer mailer){
        mailer.sendMail();
        mailer.recieveMail();
    }
    // コンピュータとしての処理
    public static void funcComputer(IComputer computer){
        computer.playGame();
        computer.borwseWeb();
    }
}