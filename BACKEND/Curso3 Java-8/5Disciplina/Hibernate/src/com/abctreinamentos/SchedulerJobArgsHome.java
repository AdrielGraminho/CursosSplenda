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
 * Home object for domain model class SchedulerJobArgs.
 * @see com.abctreinamentos.SchedulerJobArgs
 * @author Hibernate Tools
 */
public class SchedulerJobArgsHome {

	private static final Log log = LogFactory.getLog(SchedulerJobArgsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(SchedulerJobArgs transientInstance) {
		log.debug("persisting SchedulerJobArgs instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(SchedulerJobArgs instance) {
		log.debug("attaching dirty SchedulerJobArgs instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SchedulerJobArgs instance) {
		log.debug("attaching clean SchedulerJobArgs instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(SchedulerJobArgs persistentInstance) {
		log.debug("deleting SchedulerJobArgs instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SchedulerJobArgs merge(SchedulerJobArgs detachedInstance) {
		log.debug("merging SchedulerJobArgs instance");
		try {
			SchedulerJobArgs result = (SchedulerJobArgs) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public SchedulerJobArgs findById(com.abctreinamentos.SchedulerJobArgsId id) {
		log.debug("getting SchedulerJobArgs instance with id: " + id);
		try {
			SchedulerJobArgs instance = (SchedulerJobArgs) sessionFactory.getCurrentSession()
					.get("com.abctreinamentos.SchedulerJobArgs", id);
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

	public List findByExample(SchedulerJobArgs instance) {
		log.debug("finding SchedulerJobArgs instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("com.abctreinamentos.SchedulerJobArgs")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
