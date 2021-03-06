package entities;
// Generated Aug 12, 2018 6:18:05 PM by Hibernate Tools 5.2.0.Beta1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	private String tenlop;
	private Integer trangthai;
	private List<TaiKhoan> taiKhoans = new ArrayList<TaiKhoan>();

	public LopHoc() {
	}

	public LopHoc(String malophoc) {
		this.malophoc = malophoc;
	}

	public LopHoc(String malophoc, String tenlop, Integer trangthai, List<TaiKhoan> taiKhoans) {
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
	public String getTenlop() {
		return this.tenlop;
	}

	public void setTenlop(String tenlop) {
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
	public List<TaiKhoan> getTaiKhoans() {
		return this.taiKhoans;
	}

	public void setTaiKhoans(List<TaiKhoan> taiKhoans) {
		this.taiKhoans = taiKhoans;
	}

}
