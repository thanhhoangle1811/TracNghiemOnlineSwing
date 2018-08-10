/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ThamGiaDTO;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sony
 */
public class ThamGiaDAO {

    public ResultSet loadDataThamgia() {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("ups_thamGia");
            ResultSet rs = conn.executeQuery();
            return  rs;       
            
        } catch (Exception e) {
            System.out.println("DAO.ThamGiaDAO.loadDataThamgia(): " + e.getMessage());
        }

        return null;
    }
    
    public boolean insertThamGia( ThamGiaDTO thamgiaDTO) {
        try {
            CallableStatement conn = ConnectionManager.getConnection().prepareCall("{call ups_insertThamGia(?,?)}");
            conn.setInt(1, thamgiaDTO.getMatk());
            conn.setString(2, thamgiaDTO.getMamonhoc());
            int result = conn.executeUpdate();
            conn.close();
            return result > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void main(String[] args) {
//        System.out.println(ThamGiaDAO.loadDataThamgia());
    }

}
