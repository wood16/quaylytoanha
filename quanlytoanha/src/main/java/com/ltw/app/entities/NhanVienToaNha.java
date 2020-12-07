package com.ltw.app.entities;

import java.util.Date;

public class NhanVienToaNha extends NhanVien {
	
	private Integer bacCVId;
	private Integer viTriCVId;
	private Integer dichVuId;
	
	public NhanVienToaNha(String tenNhanVien, String cmt, Date ngaySinh, String diaChi, Integer soDT) {
		super(tenNhanVien, cmt, ngaySinh, diaChi, soDT);
	}

	public NhanVienToaNha(String tenNhanVien, String cmt, Date ngaySinh, String diaChi, Integer soDT, Integer bacCVId,
			Integer viTriCVId, Integer dichVuId) {
		super(tenNhanVien, cmt, ngaySinh, diaChi, soDT);
		this.bacCVId = bacCVId;
		this.viTriCVId = viTriCVId;
		this.dichVuId = dichVuId;
	}

	public Integer getBacCVId() {
		return bacCVId;
	}

	public void setBacCVId(Integer bacCVId) {
		this.bacCVId = bacCVId;
	}

	public Integer getViTriCVId() {
		return viTriCVId;
	}

	public void setViTriCVId(Integer viTriCVId) {
		this.viTriCVId = viTriCVId;
	}

	public Integer getDichVuId() {
		return dichVuId;
	}

	public void setDichVuId(Integer dichVuId) {
		this.dichVuId = dichVuId;
	}
	
	

	
	
}
