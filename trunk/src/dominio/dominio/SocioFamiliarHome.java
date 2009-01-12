package dominio.dominio;

// Generated 08-ene-2009 19:15:20 by Hibernate Tools 3.2.4.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class SocioFamiliar.
 * @see dominio.dominio.SocioFamiliar
 * @author Hibernate Tools
 */
public class SocioFamiliarHome {

	private static final Log log = LogFactory.getLog(SocioFamiliarHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SocioFamiliar transientInstance) {
		log.debug("persisting SocioFamiliar instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SocioFamiliar instance) {
		log.debug("attaching dirty SocioFamiliar instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SocioFamiliar instance) {
		log.debug("attaching clean SocioFamiliar instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SocioFamiliar persistentInstance) {
		log.debug("deleting SocioFamiliar instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SocioFamiliar merge(SocioFamiliar detachedInstance) {
		log.debug("merging SocioFamiliar instance");
		try {
			SocioFamiliar result = (SocioFamiliar) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SocioFamiliar findById(dominio.dominio.SocioFamiliarId id) {
		log.debug("getting SocioFamiliar instance with id: " + id);
		try {
			SocioFamiliar instance = (SocioFamiliar) sessionFactory
					.getCurrentSession().get("dominio.dominio.SocioFamiliar",
							id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SocioFamiliar instance) {
		log.debug("finding SocioFamiliar instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria(
					"dominio.dominio.SocioFamiliar").add(
					Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
