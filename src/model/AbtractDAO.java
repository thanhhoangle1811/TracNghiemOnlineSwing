/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.eclipse.persistence.sessions.Session;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

/**
 *
 * @author bui.lan
 */

public class AbtractDAO {
    SessionFactory sessionFactory =  HibernateUtil.getSessionFactory();
public <T> T save(final T o){
      return (T) sessionFactory.getCurrentSession().save(o);
    }


    public void delete(final Object object){
      sessionFactory.getCurrentSession().delete(object);
    }

    /***/
    public <T> T get(final Class<T> type, final Long id){
      return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    /***/
    public <T> T merge(final T o)   {
      return (T) sessionFactory.getCurrentSession().merge(o);
    }

    /***/
    public <T> void saveOrUpdate(final T o){
      sessionFactory.getCurrentSession().saveOrUpdate(o);
    }

//    public <T>List<T> getAll(final Class<T> type) {
//      final Session session = sessionFactory.getCurrentSession().getSession();
//      final Criteria crit = session.createCriteria(type);
//      return crit.list();
//    }
}
