package com.abctreinamentos;
// Generated 16/03/2021 08:38:07 by Hibernate Tools 4.3.1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class LogmnrggcGtcs.
 * @see com.abctreinamentos.LogmnrggcGtcs
 * @author Hibernate Tools
 */
public class LogmnrggcGtcsHome {

	private static final Log log = LogFactory.getLog(LogmnrggcGtcsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LogmnrggcGtcs transientInstance) {
		log.debug("persisting LogmnrggcGtcs instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LogmnrggcGtcs instance) {
		log.debug("attaching dirty LogmnrggcGtcs instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LogmnrggcGtcs instance) {
		log.debug("attaching clean LogmnrggcGtcs instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LogmnrggcGtcs persistentInstance) {
		log.debug("deleting LogmnrggcGtcs instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LogmnrggcGtcs merge(LogmnrggcGtcs detachedInstance) {
		log.debug("merging LogmnrggcGtcs instance");
		try {
			LogmnrggcGtcs result = (LogmnrggcGtcs) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LogmnrggcGtcs findById(com.abctreinamentos.LogmnrggcGtcsId id) {
		log.debug("getting LogmnrggcGtcs instance with id: " + id);
		try {
			LogmnrggcGtcs instance = (LogmnrggcGtcs) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.LogmnrggcGtcs", id);
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

	public List findByExample(LogmnrggcGtcs instance) {
		log.debug("finding LogmnrggcGtcs instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.LogmnrggcGtcs")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
