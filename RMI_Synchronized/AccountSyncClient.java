import java.rmi.*;

public class AccountSyncClient {
    public static void main(String[] args) {
        try {
            ISyncAccount objAccount = (ISyncAccount) Naming.lookup("//localhost:2004/Account");
            objAccount.deposit(10);
            objAccount.withdraw(4.5);
            System.out.println("O saldo da conta é: " + objAccount.balance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}