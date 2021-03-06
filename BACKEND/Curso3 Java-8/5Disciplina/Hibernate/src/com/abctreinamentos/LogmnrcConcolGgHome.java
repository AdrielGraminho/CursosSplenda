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
 * Home object for domain model class LogmnrcConcolGg.
 * @see com.abctreinamentos.LogmnrcConcolGg
 * @author Hibernate Tools
 */
public class LogmnrcConcolGgHome {

	private static final Log log = LogFactory.getLog(LogmnrcConcolGgHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LogmnrcConcolGg transientInstance) {
		log.debug("persisting LogmnrcConcolGg instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LogmnrcConcolGg instance) {
		log.debug("attaching dirty LogmnrcConcolGg instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LogmnrcConcolGg instance) {
		log.debug("attaching clean LogmnrcConcolGg instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LogmnrcConcolGg persistentInstance) {
		log.debug("deleting LogmnrcConcolGg instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LogmnrcConcolGg merge(LogmnrcConcolGg detachedInstance) {
		log.debug("merging LogmnrcConcolGg instance");
		try {
			LogmnrcConcolGg result = (LogmnrcConcolGg) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LogmnrcConcolGg findById(com.abctreinamentos.LogmnrcConcolGgId id) {
		log.debug("getting LogmnrcConcolGg instance with id: " + id);
		try {
			LogmnrcConcolGg instance = (LogmnrcConcolGg) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.LogmnrcConcolGg", id);
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

	public List findByExample(LogmnrcConcolGg instance) {
		log.debug("finding LogmnrcConcolGg instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.LogmnrcConcolGg")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
