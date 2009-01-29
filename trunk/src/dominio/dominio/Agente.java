package dominio.dominio;


import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.math.BigInteger;

import dominio.*;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.type.NullableType;

import comunicaciones.Formato_horario;




public class Agente {

	private SessionFactory sessionFactory;
	private org.hibernate.classic.Session session;
	
	public void configure() throws HibernateException {
		
		
		sessionFactory = new Configuration()
		.configure()
		.buildSessionFactory();
	}
	
	public void exportTables() throws HibernateException {
		
		Configuration cfg = new Configuration()
		.addClass(Articulo.class)
		.addClass(Cliente.class)
		.addClass(DetalleRecibo.class)
		.addClass(Horario.class)
		.addClass(HorarioId.class)
		.addClass(Personal.class)
		.addClass(Pista.class)
		.addClass(Recibo.class)
		.addClass(Socio.class)
		.addClass(SocioFamiliar.class)
		.addClass(SocioFamiliarId.class)
		.addClass(SocioId.class);
		//.addClass(Usuarios.class);
		new SchemaExport(cfg).create(true, true);
	}
	
	//cogigo de cliente

	
	// METODOS PARA ARTICULOS 
	
	public boolean crearArticulo(Articulo articulo)  throws HibernateException{
		Session sesion= sessionFactory.openSession();
		boolean bien=false;
		Transaction tx = null;
		try {
			tx = sesion.beginTransaction();
			sesion.persist(articulo);
			tx.commit();
			bien=true;
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		
		return bien;
	}
	
	
	
	public boolean borrarArticulo(int art) throws HibernateException {
		
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		boolean bien=true;
		try {
			tx = sesion.beginTransaction();
			Query q = sesion.createQuery("delete from Articulo where =idarticulo"+"'art'");
			q.executeUpdate();
			tx.commit();
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback(); bien=false;
		throw he;
		}
		finally {
		sesion.close();
		}
		return bien;
		
	}
	
	public Articulo consultarArticulo(int art) throws HibernateException {
		
		Articulo artic=new Articulo();
				
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		try {
		tx = sesion.beginTransaction();
		artic = (Articulo) sesion.load(Articulo.class,art);
		
		tx.commit();
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		
		return artic;
		
	}
	
	public void modArticulo(Articulo a) throws HibernateException {
		
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = sesion.beginTransaction();
			Articulo item = (Articulo) sesion.load(Cliente.class,a.getIdarticulo());
			item.setConcepto(a.getConcepto());
			item.setProveedor(a.getProveedor());
			item.setPrecioCompra(a.getPrecioCompra());
			item.setBeneficio(a.getBeneficio());
			item.setStock(a.getStock());
			tx.commit();
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		
	}
	
	//  METODOS PARA LA TABLA CLIENTES//
	
public void crearCliente(Cliente cliente) throws HibernateException {
		
		Session sesion= sessionFactory.openSession();
		
		Transaction tx = null;
		try {
			tx = sesion.beginTransaction();
			//cliente.toString(cliente);
			sesion.save(cliente);
			//sesion.persist(cliente);
			tx.commit();
			
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		
	}
public boolean borrarCliente(String dni) throws HibernateException {
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		boolean bien=true;
		try {
			tx = sesion.beginTransaction();
			Query q = sesion.createQuery("delete from Cliente where dni="+"'dni'");
			q.executeUpdate();
			tx.commit();
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback(); bien=false;
		throw he;
		}
		finally {
		sesion.close();
		}
		return bien;
		
	}
	

	
	public Cliente leerCliente(String dni) throws HibernateException {
		
		Cliente cliente=new Cliente();
				
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		try {
		tx = sesion.beginTransaction();
		cliente = (Cliente) sesion.get(Cliente.class,dni);
		
		tx.commit();
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		
		return cliente;
		
	}
	
	public void modCliente(Cliente c) throws HibernateException {
				
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = sesion.beginTransaction();
			Cliente item = (Cliente) sesion.load(Cliente.class,c.getDni());
			item.setApellido1(c.getApellido1());
			item.setApellido2(c.getApellido2());
			item.setDireccion(c.getDireccion());
			item.setNombre(c.getNombre());
			item.setTelefono(c.getTelefono());
			item.setFechaNac(c.getFechaNac());
			item.setLocalidad(c.getLocalidad());
			tx.commit();
		}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		
	}
	
	public BigInteger cuentanumeroCliente(String dni) throws HibernateException {
		BigInteger n;
		Session sesion = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = sesion.beginTransaction();
			Query q=sesion.createSQLQuery("SELECT Count(*) from cliente where cliente.Dni='"+dni+"'");
			n=(BigInteger)q.uniqueResult();
			tx.commit();
			}
		catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		throw he;
		}
		finally {
		sesion.close();
		}
		return n;
		
	}

/// DETALLE DE RECIBO///

public void crearDetRecibo(DetalleRecibo drecibo) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(drecibo);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarDetRecibo(int id) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from DetalleRecibo where iddetalleRecibo="+"'id'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public DetalleRecibo leerDetalle(int id) throws HibernateException {
	
	DetalleRecibo detalle=new DetalleRecibo();
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	detalle = (DetalleRecibo) sesion.load(DetalleRecibo.class,id);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return detalle;
	
}

public void modDetalle(DetalleRecibo det) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		DetalleRecibo item = (DetalleRecibo) sesion.load(DetalleRecibo.class,det.getIddetalleRecibo());
		item.setConcepto(det.getConcepto());
		item.setImporte(det.getImporte());
		item.setRecibo(det.getRecibo());
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	}

///     HORARIO  ////
public void crearReserva(Horario horario) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(horario);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarReserva(HorarioId id) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Cliente where id="+"'id'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public Horario leerReserva(HorarioId id) throws HibernateException {
	
	Horario reserva=new Horario();
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	reserva = (Horario) sesion.get(Horario.class,id);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return reserva;
	
}

public String leerReserva(java.util.Date dia3,String pista) throws HibernateException {
	
	Horario reserva=new Horario();
	java.sql.Timestamp dia = new java.sql.Timestamp(dia3.getTime());
	HorarioId id=new HorarioId(pista,dia);
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	reserva = (Horario) sesion.get(Horario.class,id);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return reserva.getCliente().getDni();
	
}

public void modReserva(Horario h) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Horario item = (Horario) sesion.load(Horario.class,h.getId());
		item.setImporte(h.getImporte());
		item.setPagado(h.isPagado());
		item.setCliente(h.getCliente());
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}



public ArrayList lista_reservas_dni(String dni)throws HibernateException{
	Iterator r;
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;

	double importe=0.0;
	boolean pagado;
	List lista=null;
	ArrayList lista2=new ArrayList();
	System.out.println("mila: "+dni);

	try {
		tx = sesion.beginTransaction();
		 lista = sesion.createSQLQuery("Select pista,dia_hora,dni,importe,pagado FROM horario where  horario.dni='"+dni+"'").list();
		 for(Iterator it=lista.iterator();it.hasNext();){
		       Object[] row = (Object[]) it.next();
		   		Horario h=new Horario();
		   		HorarioId hid=new HorarioId();
				Cliente c=new Cliente();
		       hid.setPista((String)row[0]);
		       System.out.println((String)row[0]);
     	       Timestamp timeStamp = (Timestamp)row[1];  
     	       Date date = new Date(timeStamp.getTime()); 
     	       hid.setDia_hora(date);
     	      System.out.println(date);
     	       c.setDni((String)row[2]);
     	      System.out.println((String)row[2]);
     	       importe=(Double)row[3];
     	      System.out.println((Double)row[3]);
     	       pagado=(Boolean)row[4];
     	      System.out.println((Boolean)row[4]);
     	       if(pagado==true)  h=new Horario(hid,c,importe,1);
     	       else	h=new Horario(hid,c,importe,0);
     	       lista2.add(h);
		       
		     }
		tx.commit();
	}
	
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}

	return lista2;
	
}

public BigInteger hay_reserva(java.util.Date dia3, String pista){
	BigInteger n;
	java.sql.Timestamp dia = new java.sql.Timestamp(dia3.getTime());
	//java.sql.Date dia=new java.sql.Date(dia3.getTime());

	//System.out.println("dia que le paso a bd: "+dia);
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Query q=sesion.createSQLQuery("SELECT Count(*) from horario where horario.dia_hora='"+dia+"' and horario.pista='"+pista+"'");
		n=(BigInteger)q.uniqueResult();
		tx.commit();
		}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}

	return n;
}

   //// HORARIOID //

public void crearHorarioId(HorarioId idhorario) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(idhorario);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarHorarioId(HorarioId idh) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;

	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Cliente where dia="+"'idh.getDia()'"+
				"and hora="+"'idg.getHora()'"+"and pista="+"'idh.getPista()'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}

    // PERSONAL ///
public void crearPersonal(Personal personal) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(personal);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarPersonal(String usuario) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Personal where user="+"'usuario'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public Personal leerPersonal(String usuario, String pass) throws HibernateException {
	
	Personal persona=new Personal();
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	persona=(Personal) sesion.get(Personal.class, usuario);
	tx.commit();
	}
	catch (HibernateException he) {
		if (tx!=null) tx.rollback();
		System.out.println(he.toString());
		throw he;
		
	}

	finally {
		sesion.close();
		
	}
	return persona;
	
}

public void modPersonal(Personal p) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Personal item = (Personal) sesion.load(Personal.class,p.getUsuario());
		item.setClave(p.getClave());
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}

  // PISTA //
   
public void crearPista(Pista pista) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(pista);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarPista(String pista) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Pista where nombre="+"'pista'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public Pista leerPista(String idpista) throws HibernateException {
	
	Pista pista=new Pista();
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	pista = (Pista) sesion.get(Pista.class,idpista);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return pista;
	
}

//public double leerprecio(String idpista){
//		
//	double p=0.0;
//	Session sesion = sessionFactory.openSession();
//	Transaction tx = null;
//	try {
//		tx = sesion.beginTransaction();
//		Query q=sesion.createSQLQuery("SELECT Precio from pista where pista.Nombre='"+idpista+"'");
//		p=(Double)q.uniqueResult();
//		tx.commit();
//		}
//	catch (HibernateException he) {
//	if (tx!=null) tx.rollback();
//	throw he;
//	}
//	finally {
//	sesion.close();
//	}
//	
//	return p;
//	
//}

public void modPista(Pista p) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Pista item = (Pista) sesion.load(Pista.class,p.getNombre());
		item.setPrecio(p.getPrecio());
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}


	// RECIBO //	

public void crearRecibo(Recibo recibo) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(recibo);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarRecibo(int id) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Recibo where idrecibo="+"'id'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public Recibo leerRecibo(int r) throws HibernateException {
	
	Recibo recibo=new Recibo();
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	recibo = (Recibo) sesion.load(Recibo.class,r);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return recibo;
	
}

public int leerRecibo(java.util.Date dia3) throws HibernateException {
	
	Recibo recibo=new Recibo();
	int id;
	java.sql.Date dia=new java.sql.Date(dia3.getTime()); 		
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Query q=sesion.createSQLQuery("SELECT idrecibo from recibo where recibo.fecha='"+dia+"'");
		id=(Integer)q.uniqueResult();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return id;
	
}

public double leerRecibo_importe(java.util.Date dia3) throws HibernateException {
	
	Recibo recibo=new Recibo();
	double importe=0.0;
	java.sql.Date dia=new java.sql.Date(dia3.getTime()); 		
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	Query q=sesion.createSQLQuery("SELECT importe from recibo where recibo.fecha='"+dia+"'");
	importe=(Double)q.uniqueResult();
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return importe;
	
}


public void modRecibo(Recibo r) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Recibo item = (Recibo) sesion.load(Recibo.class,r.getIdrecibo());
		item.setCuenta(r.getCuenta());
		item.setFecha(r.getFecha());
		item.setSocio(r.getSocio());
		item.setDetalleRecibos(r.getDetalleRecibos());
		item.setImporte(r.getImporte());
		
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}





   // SOCIO ///

public void crearSocio(Socio socio) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(socio);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarSocio(SocioId socio) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Recibo where id="+"'socio'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public Socio leerSocio(SocioId id) throws HibernateException {
	
	Socio socio=new Socio();
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	/*Query q=sesion.createSQLQuery("SELECT * FROM socio where socio.Cod_Socio='"+id+"'");
		socio=(Socio)q.uniqueResult();*/
		socio = (Socio) sesion.get(Socio.class,id);
		/*query1.setLong("aId",Long.valueOf(1));
		List list1 = query1.list();
		Iterator iter1 = list1.iterator();
		while (iter1.hasNext()) {
		Cliente clienteQuer1 = (Cliente)iter1.next();*/
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return socio;
	
}

//public int leerSocio(String dni) throws HibernateException {
//	
//	Socio socio=new Socio();
//	SocioId socioid=new SocioId(dni);	
//	Session sesion = sessionFactory.openSession();
//	Transaction tx = null;
//	try {
//	tx = sesion.beginTransaction();
//	socio = (Socio) sesion.load(Socio.class,socioid);
//	
//	tx.commit();
//	}
//	catch (HibernateException he) {
//	if (tx!=null) tx.rollback();
//	throw he;
//	}
//	finally {
//	sesion.close();
//	}
//	
//	return socio.getId().getCodSocio();
//	
//}

//public String leerSocio(int cod_soc) throws HibernateException {
//	
//	Socio socio=new Socio();
//
//	Session sesion = sessionFactory.openSession();
//	Transaction tx = null;
//	try {
//	tx = sesion.beginTransaction();
//	socio = (Socio) sesion.load(Socio.class,cod_soc);
//	
//	tx.commit();
//	}
//	catch (HibernateException he) {
//	if (tx!=null) tx.rollback();
//	throw he;
//	}
//	finally {
//	sesion.close();
//	}
//	
//	return socio.getCliente().getDni();
//	
//}

public String leerSocio2(int cod_soc,String id) throws HibernateException {
	System.out.println(cod_soc+"   "+id);
	Socio socio=new Socio();
	SocioId sid=new SocioId(cod_soc,id);
	
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	socio = (Socio) sesion.get(Socio.class,sid);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}

	return socio.getCuentaBanco();
	
}

//public String consultar_cuenta(int cod_soc){
//	String n;
//	Session sesion = sessionFactory.openSession();
//	Transaction tx = null;
//	try {
//	tx = sesion.beginTransaction();
//	Query q=sesion.createSQLQuery("SELECT cuenta_banco  FROM Socio where socio.cod_socio='"+cod_soc+"'");
//		n=(String)q.uniqueResult();
//	tx.commit();
//	}
//	catch (HibernateException he) {
//	if (tx!=null) tx.rollback();
//	throw he;
//	}
//	finally {
//	sesion.close();
//	}
//	
//	return n;
//}


public int leerSocio(String dni){
	int n;
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	Query q=sesion.createSQLQuery("SELECT Cod_Socio FROM socio where socio.dni='"+dni+"'");
		n=(Integer)q.uniqueResult();
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return n;
	
}

public String leerSocio(int cod_soc){
	String n;
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	Query q=sesion.createSQLQuery("SELECT dni FROM socio where socio.cod_socio='"+cod_soc+"'");
		n=(String)q.uniqueResult();
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return n;
	
}

public int maxSocio(){
	int n;
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	Query q=sesion.createSQLQuery("SELECT Max(Cod_Socio)  FROM Socio");
		n=(Integer)q.uniqueResult();
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return n;
	
}



public void modSocio(Socio s) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Socio item = (Socio) sesion.load(Socio.class,s.getId());
		item.setCliente(s.getCliente());
		item.setCuentaBanco(s.getCuentaBanco());
		item.setCuota(s.getCuota());
		item.setFechaIngreso(s.getFechaIngreso());
		item.setNumeroMiembros(s.getNumeroMiembros());
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}

public BigInteger cuentanumeroSocio(String dni) throws HibernateException {
	BigInteger n;
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Query q=sesion.createSQLQuery("SELECT Count(*) from socio where socio.Dni='"+dni+"'");
		n=(BigInteger)q.uniqueResult();
		tx.commit();
		}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}

	return n;
	
}
     //  SOCIO FAMILIAR //

public void crearSFamiliar(SocioFamiliar sFamiliar) throws HibernateException {
	
	Session sesion= sessionFactory.openSession();
	
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		sesion.persist(sFamiliar);
		tx.commit();
		
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}
public boolean borrarSFamiliar(SocioFamiliarId socioFamiliar) throws HibernateException {
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	boolean bien=true;
	try {
		tx = sesion.beginTransaction();
		Query q = sesion.createQuery("delete from Recibo where id="+"'socioFamilar'");
		q.executeUpdate();
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback(); bien=false;
	throw he;
	}
	finally {
	sesion.close();
	}
	return bien;
	
}



public SocioFamiliar leerSocioFamiliar (SocioFamiliarId s) throws HibernateException {
	
	SocioFamiliar socioFamiliar=new SocioFamiliar();
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
	tx = sesion.beginTransaction();
	socioFamiliar = (SocioFamiliar) sesion.load(SocioFamiliar.class,s);
	
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return socioFamiliar;
	
}

 /*public void modSocioFamiliar(SocioFamiliar sf) throws HibernateException {
			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		SocioFamiliar item = (SocioFamiliar) sesion.load(Recibo.class,sf.getId());
		item.
		
		tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
}*/

public int leerSocioFamiliar (String dni) throws HibernateException {
	
	int cod_soc=0;			
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;

	try {
		tx = sesion.beginTransaction();
		Query q=sesion.createSQLQuery("SELECT cod_socio from socio_familiar where socio_familiar.dni='"+dni+"'");
		cod_soc=(Integer)q.uniqueResult();

		
	tx.commit();
	}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	
	return cod_soc;
	
}

public BigInteger cuentanumeroSocioFamiliar(String dni) throws HibernateException {
	BigInteger n;
	Session sesion = sessionFactory.openSession();
	Transaction tx = null;
	try {
		tx = sesion.beginTransaction();
		Query q=sesion.createSQLQuery("SELECT Count(*) from socio_familiar where socio_familiar.Dni='"+dni+"'");
		n=(BigInteger)q.uniqueResult();
		tx.commit();
		}
	catch (HibernateException he) {
	if (tx!=null) tx.rollback();
	throw he;
	}
	finally {
	sesion.close();
	}
	return n;
	
}
}