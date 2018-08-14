package entities;
// Generated Aug 12, 2018 6:18:05 PM by Hibernate Tools 5.2.0.Beta1

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CauHoi generated by hbm2java
 */
@Entity
@Table(name = "CauHoi", schema = "dbo", catalog = "QLTTN")
public class CauHoi implements java.io.Serializable {

	private Integer macauhoi;
	private MonHoc monHoc;
	private TaiKhoan taiKhoan;
	private String ndcauhoi;
	private Integer dokho;
	private String phuonganA;
	private String phuonganB;
	private String phuonganC;
	private String phuonganD;
	private Character dapan;
	private int trangthai;
	private List<DeThi> deThis = new ArrayList<DeThi>(0);

	public CauHoi() {
	}

	public CauHoi(MonHoc monHoc, TaiKhoan taiKhoan, int trangthai) {
		this.monHoc = monHoc;
		this.taiKhoan = taiKhoan;
		this.trangthai = trangthai;
	}

	public CauHoi(MonHoc monHoc, TaiKhoan taiKhoan, String ndcauhoi, Integer dokho, String phuonganA,
			String phuonganB, String phuonganC, String phuonganD, Character dapan, int trangthai,
			List<DeThi> deThis) {
		this.monHoc = monHoc;
		this.taiKhoan = taiKhoan;
		this.ndcauhoi = ndcauhoi;
		this.dokho = dokho;
		this.phuonganA = phuonganA;
		this.phuonganB = phuonganB;
		this.phuonganC = phuonganC;
		this.phuonganD = phuonganD;
		this.dapan = dapan;
		this.trangthai = trangthai;
		this.deThis = deThis;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "macauhoi", unique = true, nullable = false)
	public Integer getMacauhoi() {
		return this.macauhoi;
	}

	public void setMacauhoi(Integer macauhoi) {
		this.macauhoi = macauhoi;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mamonhoc", nullable = false)
	public MonHoc getMonHoc() {
		return this.monHoc;
	}

	public void setMonHoc(MonHoc monHoc) {
		this.monHoc = monHoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matk", nullable = false)
	public TaiKhoan getTaiKhoan() {
		return this.taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Column(name = "ndcauhoi")
	public String getNdcauhoi() {
		return this.ndcauhoi;
	}

	public void setNdcauhoi(String ndcauhoi) {
		this.ndcauhoi = ndcauhoi;
	}

	@Column(name = "dokho")
	public Integer getDokho() {
		return this.dokho;
	}

	public void setDokho(Integer dokho) {
		this.dokho = dokho;
	}

	@Column(name = "phuonganA")
	public String getPhuonganA() {
		return this.phuonganA;
	}

	public void setPhuonganA(String phuonganA) {
		this.phuonganA = phuonganA;
	}

	@Column(name = "phuonganB")
	public String getPhuonganB() {
		return this.phuonganB;
	}

	public void setPhuonganB(String phuonganB) {
		this.phuonganB = phuonganB;
	}

	@Column(name = "phuonganC")
	public String getPhuonganC() {
		return this.phuonganC;
	}

	public void setPhuonganC(String phuonganC) {
		this.phuonganC = phuonganC;
	}

	@Column(name = "phuonganD")
	public String getPhuonganD() {
		return this.phuonganD;
	}

	public void setPhuonganD(String phuonganD) {
		this.phuonganD = phuonganD;
	}

	@Column(name = "dapan", length = 1)
	public Character getDapan() {
		return this.dapan;
	}

	public void setDapan(Character dapan) {
		this.dapan = dapan;
	}

	@Column(name = "trangthai", nullable = false)
	public int getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CTDeThi", schema = "dbo", catalog = "QLTTN", joinColumns = {
			@JoinColumn(name = "macauhoi", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "madethi", nullable = false, updatable = false) })
	public List<DeThi> getDeThis() {
		return this.deThis;
	}

	public void setDeThis(List<DeThi> deThis) {
		this.deThis = deThis;
	}

}
