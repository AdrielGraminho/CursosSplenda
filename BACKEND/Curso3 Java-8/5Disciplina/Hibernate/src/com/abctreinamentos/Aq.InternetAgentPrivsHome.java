package com.abctreinamentos;
// Generated 16/03/2021 08:38:07 by Hibernate Tools 4.3.1


import Aq.InternetAgentPrivs;
import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class InternetAgentPrivs.
 * @see com.abctreinamentos.Aq.InternetAgentPrivs
 * @author Hibernate Tools
 */
public class InternetAgentPrivsHome {

    private static final Log log = LogFactory.getLog(Aq.InternetAgentPrivsHome.class);

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
    
    public void persist(InternetAgentPrivs transientInstance) {
        log.debug("persisting InternetAgentPrivs instance");
        try {
            sessionFactory.getCurrentSession().persist(transientInstance);
            log.debug("persist successful");
        }
        catch (RuntimeException re) {
            log.error("persist failed", re);
            throw re;
        }
    }
    
    public void attachDirty(InternetAgentPrivs instance) {
        log.debug("attaching dirty InternetAgentPrivs instance");
        try {
            sessionFactory.getCurrentSession().saveOrUpdate(instance);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(InternetAgentPrivs instance) {
        log.debug("attaching clean InternetAgentPrivs instance");
        try {
            sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        }
        catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void delete(InternetAgentPrivs persistentInstance) {
        log.debug("deleting InternetAgentPrivs instance");
        try {
            sessionFactory.getCurrentSession().delete(persistentInstance);
            log.debug("delete successful");
        }
        catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public InternetAgentPrivs merge(InternetAgentPrivs detachedInstance) {
        log.debug("merging InternetAgentPrivs instance");
        try {
            InternetAgentPrivs result = (InternetAgentPrivs) sessionFactory.getCurrentSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        }
        catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }
    
    public InternetAgentPrivs findById( com.abctreinamentos.Aq$InternetAgentPrivsId id) {
        log.debug("getting InternetAgentPrivs instance with id: " + id);
        try {
            InternetAgentPrivs instance = (InternetAgentPrivs) sessionFactory.getCurrentSession()
                    .get("com.abctreinamentos.Aq$InternetAgentPrivs", id);
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
    
    public List findByExample(InternetAgentPrivs instance) {
        log.debug("finding InternetAgentPrivs instance by example");
        try {
            List results = sessionFactory.getCurrentSession()
                    .createCriteria("com.abctreinamentos.Aq$InternetAgentPrivs")
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

