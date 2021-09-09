import java.rmi.*;

public class AccountClient {
    public static void main(String[] args) {
        try {
            IAccount objAccount = (IAccount) Naming.lookup("//localhost:2004/Account");
            objAccount.deposit(10);
            objAccount.withdraw(4.5);
            System.out.println("O saldo da conta é: " + objAccount.balance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}