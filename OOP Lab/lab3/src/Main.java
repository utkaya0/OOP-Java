import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Ahmet",50.00);
        Account account2 = new Account("Mehmet",-7.45);

        System.out.printf("%s balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n",account2.getName(), account2.getBalance());
    }
}