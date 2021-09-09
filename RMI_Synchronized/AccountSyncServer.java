import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class AccountSyncServer extends UnicastRemoteObject implements ISyncAccount {
    private static double balance = 0;

    public AccountSyncServer() throws RemoteException {
        super();
    }

    @Override
    public synchronized void deposit(double value) throws RemoteException {
        System.out.println("Depositado: " + value);
        balance += value;
    }

    @Override
    public synchronized void withdraw(double value) throws RemoteException {
        System.out.println("Sacado: " + value);
        balance -= value;
    }

    @Override
    public synchronized double balance() throws RemoteException {
        return balance;
    }

    public static void main(String args[]) {
        try {
            LocateRegistry.createRegistry(2004);
            AccountSyncServer objRMI = new AccountSyncServer();
            Naming.rebind("//localhost:2004/Account", objRMI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}