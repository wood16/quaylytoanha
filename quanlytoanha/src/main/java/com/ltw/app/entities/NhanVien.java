package com.ltw.app.entities;

import java.util.Date;

public class NhanVien {
	protected Integer id;
	protected String tenNV;
	protected String cmt;
	protected Date ngaySinh;
	protected String diaChi;
	protected Integer soDT;
	
	
	public NhanVien(String tenNhanVien, String cmt, Date ngaySinh, String diaChi, Integer soDT) {
		super();
		this.tenNV = tenNhanVien;
		this.cmt = cmt;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDT = soDT;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


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
