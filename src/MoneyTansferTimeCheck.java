public class MoneyTansferTimeCheck {
    public static void main(String[] args) {

        System.out.println("---HAVALE KONTROL SISTEMI---");
        System.out.println("Senaryo_1");
        isTransferValid(10, false);
        System.out.println("Senaryo_2");
        isTransferValid(7, true);
        System.out.println("Senaryo_3");
        isTransferValid(24, true);
        System.out.println("Senaryo_4");
        isTransferValid(14, true);
    }


    public static void isTransferValid(int hour, boolean isWeekday) {
        if (canTransfer(hour, isWeekday) == true) {
            System.out.println("Islem gerceklesiyor");
        } else {
            System.out.println("Islem basarisiz");
        }
    }


    public static boolean canTransfer(int hour, boolean isWeekday) {
        if (isWeekday == false) {
            System.out.println("HATA: Haftasonu para transferi yapilamaz");
            return false;
        }
        if (hour < 9) {
            System.out.println("HATA: 09.00'dan once islem yapilamaz");
            return false;
        }
        if (hour > 23) {
            System.out.println("HATA:23.00'dan sonra islem yapilamaz");
            return false;
        }

        return true;
    }

}
