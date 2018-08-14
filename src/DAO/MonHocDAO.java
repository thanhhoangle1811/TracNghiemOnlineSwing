/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.MonHoc;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author le.hoang
 */
public class MonHocDAO extends  AbstractDao{
    public List<MonHoc> getAll(){
        return (List<MonHoc>) super.findAll(MonHoc.class);
    }
    public ArrayList<String> getListTenMonHoc(){
        ArrayList<String> result = new ArrayList<String>();
        List<MonHoc>  monHocs = this.getAll();
        
        for (int i = 0; i < monHocs.size(); i++) {
            result.add(monHocs.get(i).getTenmonhoc());
        }
        return result;
    }
    
    public boolean saveOrUpdate(MonHoc monHoc) {
        try {
            super.saveOrUpdate(monHoc);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
        
}
