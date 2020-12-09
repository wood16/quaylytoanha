package com.ltw.app.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CongTy")

public class CongTy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "congTyId")
	private Integer congTyId;

	@Column(name = "maSoThue")
	private String maSoThue;

	@Column(name = "vonDieuLe")
	private Long vonDieuLe;

	@Column(name = "linhVucHoatDong")
	private String linhVucHoatDong;

	@Column(name = "diaChi")
	private String diaChi;

	@Column(name = "SoDT")
	private Integer SoDT;

	@Column(name = "dienTichMB")
	private Float dienTichMB;

	@Column(name = "soNhanVien")
	private Integer soNhanVien;

	@OneToMany(targetEntity = NhanVienCongTy.class)
	private Set<NhanVienCongTy> danhSachNhanVien;

	public Set<NhanVienCongTy> getDanhSachNhanVien() {
		return danhSachNhanVien;
	}

	public void setDanhSachNhanVien(Set<NhanVienCongTy> danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}

	public CongTy() {
		super();
	}

	

	public CongTy(Integer id, String maSoThue, Long vonDieuLe, String linhVucHoatDong, String diaChi, Integer soDT,
			Float dienTichMB, Integer soNhanVien, Set<NhanVienCongTy> danhSachNhanVien) {
		super();
		this.congTyId = id;
		this.maSoThue = maSoThue;
		this.vonDieuLe = vonDieuLe;
		this.linhVucHoatDong = linhVucHoatDong;
		this.diaChi = diaChi;
		SoDT = soDT;
		this.dienTichMB = dienTichMB;
		this.soNhanVien = soNhanVien;
		this.danhSachNhanVien = danhSachNhanVien;
	}

	public Integer getId() {
		return congTyId;
	}

	public void setId(Integer id) {
		this.congTyId = id;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public Long getVonDieuLe() {
		return vonDieuLe;
	}

	public void setVonDieuLe(Long vonDieuLe) {
		this.vonDieuLe = vonDieuLe;
	}

	public String getLinhVucHoatDong() {
		return linhVucHoatDong;
	}

	public void setLinhVucHoatDong(String linhVucHoatDong) {
		this.linhVucHoatDong = linhVucHoatDong;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Integer getSoDT() {
		return SoDT;
	}

	public void setSoDT(Integer soDT) {
		SoDT = soDT;
	}

	public Float getDienTichMB() {
		return dienTichMB;
	}

	public void setDienTichMB(Float dienTichMB) {
		this.dienTichMB = dienTichMB;
	}

	public Integer getSoNhanVien() {
		return soNhanVien;
	}

	public void setSoNhanVien(Integer soNhanVien) {
		this.soNhanVien = soNhanVien;
	}

}
