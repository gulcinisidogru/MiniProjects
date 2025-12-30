public class LimitCheck {
    public static void main(String[] args) {

        //need some data
        double balance = 15000; // bakiye
        double dailyLimit = 5000; // günlük harcama limiti
        double spentToday = 200; // bugün harcanılan tutar
        double amount = 290; // şuan harcamak istediğimiz tutar

        System.out.println("limit:" + dailyLimit + " | Harcanan" + spentToday);

        System.out.println("mevcut harcanan:"+ spentToday);
        System.out.println("talep edilen yeni harcama tutarı:"+amount);

        if(canSpend(dailyLimit,spentToday,amount) == true){
            System.out.println("islem basarılı harcama yapılıyor");
            spentToday = updateSpent(amount,spentToday);
            System.out.println("güncel toplam harcanılan "+ spentToday);

        }
        else{
            System.out.println("islem basarısız");
        }




    }

    public static boolean canSpend(double dailyLimit, double spentToday, double amount){
        //buraya kurallar gelecek

        //ilk kural: harcanmak istenilen tutar 0 veya negatif olamaz
        if(amount<=0){
            System.out.println("Hata: Gecersiz tutar girisi");
            return false;
        }

        //ikinci kural: harcanmak istenen tutar ve gün içinde harcananların toplamı, günlük limitten büyük olamaz
        if((amount+spentToday>dailyLimit)){
            System.out.println("Hata: günlük harcama limitinizi astınız");
            return false;
        }

        return true;
    }

    // yeni metod: updateSpent yani mevcut harcanan + şuan harcananı bana verecek olan bir metod
    public static double updateSpent(double amount,double spentToday){
        return amount+spentToday;
    }



 }


