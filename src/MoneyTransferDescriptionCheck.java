public class MoneyTransferDescriptionCheck {

    public static void main (String[] args){

        double balance = 580;
        double amount = 100;
        String description = "islem";
        //String description = "";
        //String description = "    ";
        //String description = null;

        if(isTransferValid(balance,amount,description)==false){
            System.out.println("ISLEM BASARISIZ");
        }
        else{
            System.out.println("ISLEM BASARILI");
            balance =updatedBalance(balance,amount);
            System.out.println("YENI BAKIYENIZ:"+balance);
        }




    }

    public static boolean isTransferValid (double balance, double amount, String description){

        if(amount<=0){
            System.out.println("HATA: cekilmek istenen tutar gecersiz");
            return false;
        }

        if(amount>balance){
            System.out.println("HATA: yetersiz bakiye");
            return false;
        }

        if(description == null){
            System.out.println("HATA: aciklama bos olamaz");
            return false;
        }
        if(description.isBlank()){
            System.out.println("HATA: BOS");
            return false;
        }


        return true;
    }


    public static double updatedBalance (double balance,double amount){
        return balance-amount;
    }

}
