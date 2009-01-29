package comunicaciones;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import persistencia.JFIdentificar;


public class Empleado extends UnicastRemoteObject implements IEmpleado {
	
	private JFIdentificar ventana;

	public Empleado(JFIdentificar ventana,int puerto) throws RemoteException, MalformedURLException, AlreadyBoundException {
		super();
		LocateRegistry.createRegistry(puerto);
		Naming.bind("rmi://127.0.0.1:" + puerto + "/empleado", this);
		this.ventana=ventana;
		
	}

	@Override
	public void notificarEvento(String msg) throws RemoteException {
		this.ventana.notificarEvento(msg);
	}

}