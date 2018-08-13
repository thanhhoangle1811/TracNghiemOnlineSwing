import DAO.TaiKhoanDAO;

import entities.TaiKhoan;

public class MainApp {
    //http://www.java2s.com/Code/Java/Hibernate/SimpleDaoFindAll.htm
  public static void main(String[] args) {
//    Session session = HibernateUtil.getSessionFactory().openSession();
//    session.getTransaction().begin();
//    // Check database version
//    String sql = "FROM TaiKhoan";
//    TaiKhoan tk = session.find(TaiKhoan.class, 1);
//    List<TaiKhoan> taiKhoans = session.createQuery("from TaiKhoan").getResultList();
////    System.out.println(result);
//
//    session.getTransaction().commit();
//    session.close();
//
//    
//    HibernateUtil.shutdown();
//    
    
      TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
      TaiKhoan tk = taiKhoanDAO.findByUsername("son","123456");
      System.out.println("TaiKhoan" + tk.getUsername());
    
  }
}