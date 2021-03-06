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
 * Home object for domain model class LogmnrpCtasPartMap.
 * @see com.abctreinamentos.LogmnrpCtasPartMap
 * @author Hibernate Tools
 */
public class LogmnrpCtasPartMapHome {

	private static final Log log = LogFactory.getLog(LogmnrpCtasPartMapHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LogmnrpCtasPartMap transientInstance) {
		log.debug("persisting LogmnrpCtasPartMap instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(LogmnrpCtasPartMap instance) {
		log.debug("attaching dirty LogmnrpCtasPartMap instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LogmnrpCtasPartMap instance) {
		log.debug("attaching clean LogmnrpCtasPartMap instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(LogmnrpCtasPartMap persistentInstance) {
		log.debug("deleting LogmnrpCtasPartMap instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LogmnrpCtasPartMap merge(LogmnrpCtasPartMap detachedInstance) {
		log.debug("merging LogmnrpCtasPartMap instance");
		try {
			LogmnrpCtasPartMap result = (LogmnrpCtasPartMap) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LogmnrpCtasPartMap findById(com.abctreinamentos.LogmnrpCtasPartMapId id) {
		log.debug("getting LogmnrpCtasPartMap instance with id: " + id);
		try {
			LogmnrpCtasPartMap instance = (LogmnrpCtasPartMap) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.LogmnrpCtasPartMap", id);
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

	public List findByExample(LogmnrpCtasPartMap instance) {
		log.debug("finding LogmnrpCtasPartMap instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.LogmnrpCtasPartMap")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
