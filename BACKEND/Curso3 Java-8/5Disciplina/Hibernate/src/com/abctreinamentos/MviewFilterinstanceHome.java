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
 * Home object for domain model class MviewFilterinstance.
 * @see com.abctreinamentos.MviewFilterinstance
 * @author Hibernate Tools
 */
public class MviewFilterinstanceHome {

	private static final Log log = LogFactory.getLog(MviewFilterinstanceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(MviewFilterinstance transientInstance) {
		log.debug("persisting MviewFilterinstance instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(MviewFilterinstance instance) {
		log.debug("attaching dirty MviewFilterinstance instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MviewFilterinstance instance) {
		log.debug("attaching clean MviewFilterinstance instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(MviewFilterinstance persistentInstance) {
		log.debug("deleting MviewFilterinstance instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MviewFilterinstance merge(MviewFilterinstance detachedInstance) {
		log.debug("merging MviewFilterinstance instance");
		try {
			MviewFilterinstance result = (MviewFilterinstance) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MviewFilterinstance findById(com.abctreinamentos.MviewFilterinstanceId id) {
		log.debug("getting MviewFilterinstance instance with id: " + id);
		try {
			MviewFilterinstance instance = (MviewFilterinstance) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.MviewFilterinstance", id);
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

	public List findByExample(MviewFilterinstance instance) {
		log.debug("finding MviewFilterinstance instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.MviewFilterinstance")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
