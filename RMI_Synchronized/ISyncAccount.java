import java.rmi.*;

public interface ISyncAccount extends Remote {
    void deposit(double i) throws RemoteException;

    void withdraw(double i) throws RemoteException;

    double balance() throws RemoteException;
}
