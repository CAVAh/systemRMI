import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class AccountServer extends UnicastRemoteObject implements IAccount {
    private static double balance = 0;

    public AccountServer() throws RemoteException {
        super();
    }

    @Override
    public void deposit(double value) throws RemoteException {
        System.out.println("Depositado: " + value);
        balance += value;
    }

    @Override
    public void withdraw(double value) throws RemoteException {
        System.out.println("Sacado: " + value);
        balance -= value;
    }

    @Override
    public double balance() throws RemoteException {
        return balance;
    }

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(2004);
            AccountServer objRMI = new AccountServer();
            Naming.rebind("//localhost:2004/Account", objRMI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}