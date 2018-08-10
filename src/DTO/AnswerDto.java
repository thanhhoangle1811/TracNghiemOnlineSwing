/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Sony
 */
public class AnswerDto {
    private int cauHoiSo;
    private String paTraLoi;
    private int chon;

    public AnswerDto() {
    }

    public AnswerDto(String paTraLoi, int chon) {
        this.paTraLoi = paTraLoi;
        this.chon = chon;
    }
    
    public AnswerDto(int cauHoiSo, String paTraLoi, int chon) {
        this.cauHoiSo = cauHoiSo;
        this.paTraLoi = paTraLoi;
        this.chon = chon;
    }
    

    public int getCauHoiSo() {
        return cauHoiSo;
    }

    public void setCauHoiSo(int cauHoiSo) {
        this.cauHoiSo = cauHoiSo;
    }

    public String getPaTraLoi() {
        return paTraLoi;
    }

    public void setPaTraLoi(String paTraLoi) {
        this.paTraLoi = paTraLoi;
    }

    public int getChon() {
        return chon;
    }

    public void setChon(int chon) {
        this.chon = chon;
    }

    @Override
    public String toString() {
        return "AnswerDto{" + "cauHoiSo=" + cauHoiSo + ", paTraLoi=" + paTraLoi + ", chon=" + chon + '}';
    }
    
    
}
