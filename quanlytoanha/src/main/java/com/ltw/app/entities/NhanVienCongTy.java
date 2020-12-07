package com.ltw.app.entities;

import java.util.Date;

public class NhanVienCongTy extends NhanVien{
	private Integer congTyID;
	
	public NhanVienCongTy(String tenNhanVien, String cmt, Date ngaySinh, String diaChi, Integer soDT) {
		super(tenNhanVien, cmt, ngaySinh, diaChi, soDT);
		// TODO Auto-generated constructor stub
	}

	public NhanVienCongTy(String tenNhanVien, String cmt, Date ngaySinh, String diaChi, Integer soDT,
			Integer congTyID) {
		super(tenNhanVien, cmt, ngaySinh, diaChi, soDT);
		this.congTyID = congTyID;
	}

	public Integer getCongTyID() {
		return congTyID;
	}

	public void setCongTyID(Integer congTyID) {
		this.congTyID = congTyID;
	}
	
	
	
	
	
	
}
