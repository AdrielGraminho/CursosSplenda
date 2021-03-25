package com.abctreinamentos;
// Generated 16/03/2021 08:38:07 by Hibernate Tools 4.3.1


import Mview.AdvTemp;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class AdvTemp.
 * @see com.abctreinamentos.Mview.AdvTemp
 * @author Hibernate Tools
 */
public class AdvTempHome {

    private static final Log log = LogFactory.getLog(Mview.AdvTempHome.class);

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
    
    public void persist(AdvTemp transientInstance) {
        log.debug("persisting AdvTemp instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(AdvTemp instance) {
        log.debug("attaching dirty AdvTemp instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(AdvTemp instance) {
        log.debug("attaching clean AdvTemp instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(AdvTemp persistentInstance) {
        log.debug("deleting AdvTemp instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public AdvTemp merge(AdvTemp detachedInstance) {
        log.debug("merging AdvTemp instance");
        try {
            AdvTemp result = (AdvTemp) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public AdvTemp findById( com.abctreinamentos.Mview$AdvTempId id) {
        log.debug("getting AdvTemp instance with id: " + id);
        try {
            AdvTemp instance = (AdvTemp) sessionFactory.getCurrentSession()
                    .get("com.abctreinamentos.Mview$AdvTemp", id);
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
    
    public List findByExample(AdvTemp instance) {
        log.debug("finding AdvTemp instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.abctreinamentos.Mview$AdvTemp")
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

