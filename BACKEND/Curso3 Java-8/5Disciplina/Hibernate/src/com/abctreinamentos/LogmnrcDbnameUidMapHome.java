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
 * Home object for domain model class LogmnrcDbnameUidMap.
 * @see com.abctreinamentos.LogmnrcDbnameUidMap
 * @author Hibernate Tools
 */
public class LogmnrcDbnameUidMapHome {

	private static final Log log = LogFactory.getLog(LogmnrcDbnameUidMapHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LogmnrcDbnameUidMap transientInstance) {
		log.debug("persisting LogmnrcDbnameUidMap instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LogmnrcDbnameUidMap instance) {
		log.debug("attaching dirty LogmnrcDbnameUidMap instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LogmnrcDbnameUidMap instance) {
		log.debug("attaching clean LogmnrcDbnameUidMap instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LogmnrcDbnameUidMap persistentInstance) {
		log.debug("deleting LogmnrcDbnameUidMap instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LogmnrcDbnameUidMap merge(LogmnrcDbnameUidMap detachedInstance) {
		log.debug("merging LogmnrcDbnameUidMap instance");
		try {
			LogmnrcDbnameUidMap result = (LogmnrcDbnameUidMap) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LogmnrcDbnameUidMap findById(com.abctreinamentos.LogmnrcDbnameUidMapId id) {
		log.debug("getting LogmnrcDbnameUidMap instance with id: " + id);
		try {
			LogmnrcDbnameUidMap instance = (LogmnrcDbnameUidMap) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.LogmnrcDbnameUidMap", id);
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

	public List findByExample(LogmnrcDbnameUidMap instance) {
		log.debug("finding LogmnrcDbnameUidMap instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.LogmnrcDbnameUidMap")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
