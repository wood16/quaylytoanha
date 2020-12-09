package com.ltw.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NhanVienCongTy")
public class NhanVienCongTy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nhanVienId")
	private Integer nhanVienId;

	@Column(name = "TenNV")
	private String tenNV;

	@Column(name = "CMT")
	private String cmt;

	@Column(name = "NgaySinh")
	private Date ngaySinh;

	@Column(name = "DiaChi")
	private String diaChi;

	@Column(name = "SDT")
	private Integer soDT;

//	@ManyToOne(targetEntity = CongTy.class)
//	@JoinColumn(name = "congTyId")
//	private CongTy congty;

	public NhanVienCongTy() {
		super();
	}

	public NhanVienCongTy(Integer nhanVienId, String tenNV, String cmt, Date ngaySinh, String diaChi, Integer soDT) {
		super();
		this.nhanVienId = nhanVienId;
		this.tenNV = tenNV;
		this.cmt = cmt;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDT = soDT;
//		this.congty = congty;
	}

	public Integer getNhanVienId() {
		return nhanVienId;
	}

	public void setNhanVienId(Integer nhanVienId) {
		this.nhanVienId = nhanVienId;
	}

//	public CongTy getCongty() {
//		return congty;
//	}
//
//	public void setCongty(CongTy congty) {
//		this.congty = congty;
//	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Integer getSoDT() {
		return soDT;
	}

	public void setSoDT(Integer soDT) {
		this.soDT = soDT;
	}

}
