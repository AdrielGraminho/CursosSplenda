package com.abctreinamentos;
// Generated 16/03/2021 08:38:07 by Hibernate Tools 4.3.1


import Logstdby.skipTransaction;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class skipTransaction.
 * @see com.abctreinamentos.Logstdby.skipTransaction
 * @author Hibernate Tools
 */
public class skipTransactionHome {

    private static final Log log = LogFactory.getLog(Logstdby.skipTransactionHome.class);

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
    
    public void persist(skipTransaction transientInstance) {
        log.debug("persisting skipTransaction instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(skipTransaction instance) {
        log.debug("attaching dirty skipTransaction instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(skipTransaction instance) {
        log.debug("attaching clean skipTransaction instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(skipTransaction persistentInstance) {
        log.debug("deleting skipTransaction instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public skipTransaction merge(skipTransaction detachedInstance) {
        log.debug("merging skipTransaction instance");
        try {
            skipTransaction result = (skipTransaction) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public skipTransaction findById( com.abctreinamentos.Logstdby$skipTransactionId id) {
        log.debug("getting skipTransaction instance with id: " + id);
        try {
            skipTransaction instance = (skipTransaction) sessionFactory.getCurrentSession()
                    .get("com.abctreinamentos.Logstdby$skipTransaction", id);
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
    
    public List findByExample(skipTransaction instance) {
        log.debug("finding skipTransaction instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.abctreinamentos.Logstdby$skipTransaction")
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

