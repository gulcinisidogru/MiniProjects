import java.util.Scanner;

public class MoneyTransfer {

    public static void main (String[] args){

        Scanner klavye = new Scanner(System.in);
        //değişken tanımla
        double myAccount = 5000.0;


        System.out.println("MY BALANCE:"+myAccount);
        System.out.println("göndermek istediğiniz tutarı giriniz:");

        double moneyToBeSent = klavye.nextDouble();

        //yeterli para var mı kontrolü

        if(moneyToBeSent>0 && moneyToBeSent<= myAccount){
            System.out.println("işlem başarılı! yeni bakiye:"+(myAccount-moneyToBeSent));
        } else if (moneyToBeSent<=0) {
            System.out.println("HATA: 0 veya negatif miktar gönderemezsiniz");
        } else{
            System.out.println("hesabınızda yeterli miktarda para yok. işlem başarısız!");
        }

        klavye.close();

    }
}
