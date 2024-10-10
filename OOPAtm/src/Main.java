public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        Account account = new Account("Utku Kaya","12345",1500);

        atm.start(account);
        System.out.println("Programdan Cikiliyor");
    }
}