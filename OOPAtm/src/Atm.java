import java.util.Scanner;

public class Atm {
    public void start(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hosgeldiniz");
        int count=3;
        while (true){
            if (login.login(account)){
                System.out.println("Giris Basarili");
                break;
            }
            else{
                System.out.println("Giris Basarisiz");
                count-=1;
                System.out.println("Kalan giris hakki: "+count);
            }
            if (count == 0){
                System.out.println("Giris Hakki Bitti");
                return;
            }
        }
        System.out.println("*******************");
        String islemler =
                "1-Bakiye Goruntule\n" +
                "2-Para Yatirma\n" +
                "3-Para Cekme\n" + "Cikis icin q'ya basin";

        System.out.println(islemler);
        System.out.println("******************");

        while(true){
            System.out.println("Islem Girin: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiye: " + account.getBalance());
            }
            else if(islem.equals("2")){
                int tutar;
                System.out.println("Yatırılacak Tutar: ");
                tutar = scanner.nextInt();
                scanner.nextLine();

                account.paraYatir(tutar);
            }
            else if(islem.equals("3")){
                int tutar;
                System.out.println("Cekilecek Tutar: ");
                tutar = scanner.nextInt();
                scanner.nextLine();

                account.paraCek(tutar);
            }
            else{
                System.out.println("Gecersiz Islem");
            }
        }
    }
}
