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
 * Home object for domain model class SchedulerJobArgsTbl.
 * @see com.abctreinamentos.SchedulerJobArgsTbl
 * @author Hibernate Tools
 */
public class SchedulerJobArgsTblHome {

	private static final Log log = LogFactory.getLog(SchedulerJobArgsTblHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SchedulerJobArgsTbl transientInstance) {
		log.debug("persisting SchedulerJobArgsTbl instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SchedulerJobArgsTbl instance) {
		log.debug("attaching dirty SchedulerJobArgsTbl instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchedulerJobArgsTbl instance) {
		log.debug("attaching clean SchedulerJobArgsTbl instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SchedulerJobArgsTbl persistentInstance) {
		log.debug("deleting SchedulerJobArgsTbl instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchedulerJobArgsTbl merge(SchedulerJobArgsTbl detachedInstance) {
		log.debug("merging SchedulerJobArgsTbl instance");
		try {
			SchedulerJobArgsTbl result = (SchedulerJobArgsTbl) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchedulerJobArgsTbl findById(com.abctreinamentos.SchedulerJobArgsTblId id) {
		log.debug("getting SchedulerJobArgsTbl instance with id: " + id);
		try {
			SchedulerJobArgsTbl instance = (SchedulerJobArgsTbl) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.SchedulerJobArgsTbl", id);
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

	public List findByExample(SchedulerJobArgsTbl instance) {
		log.debug("finding SchedulerJobArgsTbl instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.SchedulerJobArgsTbl")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
