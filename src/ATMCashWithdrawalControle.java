public class ATMCashWithdrawalControle {
    public static void main(String[] args) {

        double balance = 800;
        double withdrawalAmount =4;

        if (canWithdraw(balance, withdrawalAmount) == true) {
            balance = updateBalance(balance,withdrawalAmount);
            System.out.println("Yeni bakiyeniz: " + balance);

        } else {
            System.out.println("işlem başarısız");
        }


    }

    public static boolean canWithdraw(double balance, double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("HATA: çekmek istediğiniz tutar bakiyenizde bulunmamaktadır.");
            return false;
        }

        if(withdrawalAmount<=0){
            System.out.println("cekmek istediğiniz tutar gecersiz");
            return false;
        }

        if (withdrawalAmount%10!=0){
            System.out.println("ATM 10 un katı verir");
             return false;
        }


        else {
            System.out.println("İşlem başarılı");
            return true;
        }


    }

    public static double updateBalance(double balance, double withdrawalAmount) {
        return balance - withdrawalAmount;
    }

}