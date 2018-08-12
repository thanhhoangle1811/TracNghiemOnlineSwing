package entities;
// Generated Aug 12, 2018 6:18:05 PM by Hibernate Tools 5.2.0.Beta1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LopHoc generated by hbm2java
 */
@Entity
@Table(name = "LopHoc", schema = "dbo", catalog = "QLTTN")
public class LopHoc implements java.io.Serializable {

	private String malophoc;
	private Serializable tenlop;
	private Integer trangthai;
	private Set<TaiKhoan> taiKhoans = new HashSet<TaiKhoan>(0);

	public LopHoc() {
	}

	public LopHoc(String malophoc) {
		this.malophoc = malophoc;
	}

	public LopHoc(String malophoc, Serializable tenlop, Integer trangthai, Set<TaiKhoan> taiKhoans) {
		this.malophoc = malophoc;
		this.tenlop = tenlop;
		this.trangthai = trangthai;
		this.taiKhoans = taiKhoans;
	}

	@Id

	@Column(name = "malophoc", unique = true, nullable = false, length = 10)
	public String getMalophoc() {
		return this.malophoc;
	}

	public void setMalophoc(String malophoc) {
		this.malophoc = malophoc;
	}

	@Column(name = "tenlop")
	public Serializable getTenlop() {
		return this.tenlop;
	}

	public void setTenlop(Serializable tenlop) {
		this.tenlop = tenlop;
	}

	@Column(name = "trangthai")
	public Integer getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(Integer trangthai) {
		this.trangthai = trangthai;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lopHoc")
	public Set<TaiKhoan> getTaiKhoans() {
		return this.taiKhoans;
	}

	public void setTaiKhoans(Set<TaiKhoan> taiKhoans) {
		this.taiKhoans = taiKhoans;
	}

}