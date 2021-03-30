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
 * Home object for domain model class LogmnrcIndcolGg.
 * @see com.abctreinamentos.LogmnrcIndcolGg
 * @author Hibernate Tools
 */
public class LogmnrcIndcolGgHome {

	private static final Log log = LogFactory.getLog(LogmnrcIndcolGgHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LogmnrcIndcolGg transientInstance) {
		log.debug("persisting LogmnrcIndcolGg instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LogmnrcIndcolGg instance) {
		log.debug("attaching dirty LogmnrcIndcolGg instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LogmnrcIndcolGg instance) {
		log.debug("attaching clean LogmnrcIndcolGg instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LogmnrcIndcolGg persistentInstance) {
		log.debug("deleting LogmnrcIndcolGg instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LogmnrcIndcolGg merge(LogmnrcIndcolGg detachedInstance) {
		log.debug("merging LogmnrcIndcolGg instance");
		try {
			LogmnrcIndcolGg result = (LogmnrcIndcolGg) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LogmnrcIndcolGg findById(com.abctreinamentos.LogmnrcIndcolGgId id) {
		log.debug("getting LogmnrcIndcolGg instance with id: " + id);
		try {
			LogmnrcIndcolGg instance = (LogmnrcIndcolGg) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.LogmnrcIndcolGg", id);
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

	public List findByExample(LogmnrcIndcolGg instance) {
		log.debug("finding LogmnrcIndcolGg instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.LogmnrcIndcolGg")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
