import java.util.List;

import org.hibernate.Session;

import entities.TaiKhoan;
import model.HibernateUtil;

public class MainApp {
    //http://www.java2s.com/Code/Java/Hibernate/SimpleDaoFindAll.htm
  public static void main(String[] args) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.getTransaction().begin();
    // Check database version
    String sql = "FROM TaiKhoan";
    TaiKhoan tk = session.find(TaiKhoan.class, 1);
    List<TaiKhoan> taiKhoans = session.createQuery("from TaiKhoan").getResultList();
//    System.out.println(result);

    session.getTransaction().commit();
    session.close();

    
    HibernateUtil.shutdown();
  }
}