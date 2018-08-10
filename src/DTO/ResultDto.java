/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Sony
 */
public class ResultDto {

    private int matk;
    private int madethi;
    private float diemThi;
    private Date ngayThi;

    public ResultDto() {
    }

    public ResultDto(int matk, int madethi, float diemThi, Date ngayThi) {
        this.matk = matk;
        this.madethi = madethi;
        this.diemThi = diemThi;
        this.ngayThi = ngayThi;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    public Date getNgayThi() {
        return ngayThi;
    }

    public void setNgayThi(Date ngayThi) {
        this.ngayThi = ngayThi;
    }

    public int getMadethi() {
        return madethi;
    }

    public void setMadethi(int madethi) {
        this.madethi = madethi;
    }

    @Override
    public String toString() {
        return "ResultDto{" + "matk=" + matk + ", madethi=" + madethi + ", diemThi=" + diemThi + ", ngayThi=" + ngayThi + '}';
    }

}
