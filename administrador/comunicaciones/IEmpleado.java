package comunicaciones;

import java.rmi.RemoteException;

public interface IEmpleado {

	void notificarEvento(String msg) throws RemoteException;

}
