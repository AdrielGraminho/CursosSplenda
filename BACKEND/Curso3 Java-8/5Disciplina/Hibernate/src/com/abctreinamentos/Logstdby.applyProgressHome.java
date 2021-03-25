package com.abctreinamentos;
// Generated 16/03/2021 08:38:07 by Hibernate Tools 4.3.1


import Logstdby.applyProgress;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class applyProgress.
 * @see com.abctreinamentos.Logstdby.applyProgress
 * @author Hibernate Tools
 */
public class applyProgressHome {

    private static final Log log = LogFactory.getLog(Logstdby.applyProgressHome.class);

    private final SessionFactory sessionFactory = getSessionFactory();
    
    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup("SessionFactory");
        }
        catch (Exception e) {
            log.error("Could not locate SessionFactory in JNDI", e);
            throw new IllegalStateException("Could not locate SessionFactory in JNDI");
        }
    }
    
    public void persist(applyProgress transientInstance) {
        log.debug("persisting applyProgress instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(applyProgress instance) {
        log.debug("attaching dirty applyProgress instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(applyProgress instance) {
        log.debug("attaching clean applyProgress instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(applyProgress persistentInstance) {
        log.debug("deleting applyProgress instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public applyProgress merge(applyProgress detachedInstance) {
        log.debug("merging applyProgress instance");
        try {
            applyProgress result = (applyProgress) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public applyProgress findById( com.abctreinamentos.Logstdby$applyProgressId id) {
        log.debug("getting applyProgress instance with id: " + id);
        try {
            applyProgress instance = (applyProgress) sessionFactory.getCurrentSession()
                    .get("com.abctreinamentos.Logstdby$applyProgress", id);
            if (instance==null) {
                log.debug("get successful, no instance found");
            }
            else {
                log.debug("get successful, instance found");
            }
            return instance;
        }
        catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    public List findByExample(applyProgress instance) {
        log.debug("finding applyProgress instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.abctreinamentos.Logstdby$applyProgress")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        }
        catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    } 
}

