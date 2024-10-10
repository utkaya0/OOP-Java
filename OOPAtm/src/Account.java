public class Account {
    private String userName;
    private String password;
    private int balance;

    public Account(String userName, String password,int balance) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void paraYatir(int tutar){
        balance +=tutar;
        System.out.println("Current Balance = "+balance);
    }
    public void paraCek(int tutar){
        if (balance-tutar < 0){
            System.out.println("Yetersiz Bakiye");
        }
        else{
            balance -= tutar;
            System.out.println("Current Balance = "+balance);
        }
    }
}
