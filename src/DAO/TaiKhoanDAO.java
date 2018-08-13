/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Authentication;
import entities.TaiKhoan;
import org.hibernate.HibernateException;
import org.hibernate.query.Query;

/**
 *
 * @author bui.lan
 */
public class TaiKhoanDAO extends AbstractDao{
    public TaiKhoanDAO(){
        super();
    }
    
    public TaiKhoan findByUsername(String username, String password){
        TaiKhoan obj = null;
        try {
            startOperation();
            String sql = "FROM TaiKhoan T WHERE T.username = :username AND T.pass = :pass";
            Query query = session.createQuery(sql)
                    .setParameter("username", username)
                    .setParameter("pass", password);
            obj = (TaiKhoan) query.getSingleResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return obj;
    }
    
    public TaiKhoan find(Integer id){
        return (TaiKhoan) super.find(TaiKhoan.class, id);
    }
}
