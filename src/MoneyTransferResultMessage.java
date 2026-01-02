public class MoneyTransferResultMessage {
    public static void main(String[] args) {

        double balance = 660;
        double amount = 10;
        String description = "desc";


        String resultMessage = getTransferResultMessage(balance, amount, description);

        if (isTransferValid(balance, amount, description) == true) {
            balance = balance - amount;
            System.out.println("islem tamamlandi yeni bakiyeniz:" + balance);

        } else {
            System.out.println("HATA");
            System.out.println("Detayli hata mesaji:" + resultMessage);
        }


    }


    public static String getTransferResultMessage(double balance, double amount, String description) {

        if (amount <= 0) {
            return ("HATA: gecersiz tutar girisi");
        }
        if (amount > balance) {
            return ("HATA: bakiye yetersiz");

        }
        if (description == null) {
            return ("HATA: aciklama bos olamaz");
        }
        if (description.isBlank()) {
            return ("HATA: aciklama bos");
        }


        return ("islem basarili");

    }


    public static boolean isTransferValid(double balance, double amount, String description) {
        String result = getTransferResultMessage(balance, amount, description);
        return result.equals("islem basarili");


    }


}
