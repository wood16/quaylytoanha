package com.ltw.app.api;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltw.app.entities.NhanVienCongTy;
import com.ltw.app.repositories.NhanVienCongTyResipotory;

@RestController
@RequestMapping("/api/nhan-vien-cong-ty")
public class NhanVienCongTyController {
	
	private NhanVienCongTyResipotory nhanvienctyRepository;
	
	// CRUD nhan-vien-cong-ty
	
	
	public NhanVienCongTyController(NhanVienCongTyResipotory nhanvienctyRepository) {
		super();
		this.nhanvienctyRepository = nhanvienctyRepository;
	}
	
	@GetMapping("/")
	public List<NhanVienCongTy> getAll() {
		return nhanvienctyRepository.findAll();
	}
	
	

	@GetMapping("/{id}")
	public NhanVienCongTy getNhanvienById(@PathVariable("id") Integer id) {
		Optional<NhanVienCongTy> opNhanVien = nhanvienctyRepository.findById(id);
		if (opNhanVien.isPresent()) {
			return opNhanVien.get();
		}
		
		return null;
	}
	
	@PostMapping("/")
	public void createNhanVien(@RequestBody NhanVienCongTy nhanvien) {
		nhanvienctyRepository.save(nhanvien);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<NhanVienCongTy> updateNhanVien(@PathVariable("id") Integer id, @RequestBody NhanVienCongTy nhanvien){
		Optional<NhanVienCongTy> opNhanVien = nhanvienctyRepository.findById(id);
		if (opNhanVien.isPresent()) {
			NhanVienCongTy orginal = opNhanVien.get();
			orginal.setCmt(nhanvien.getCmt());
			orginal.setDiaChi(nhanvien.getDiaChi());
			orginal.setNgaySinh(nhanvien.getNgaySinh());
			orginal.setSoDT(nhanvien.getSoDT());
			orginal.setTenNV(nhanvien.getTenNV());
			
			nhanvienctyRepository.save(orginal);
			return ResponseEntity.ok(orginal);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<NhanVienCongTy> deleteNhanVien(@PathVariable("id") Integer id){
		Optional<NhanVienCongTy> opNhanVien = nhanvienctyRepository.findById(id);
		if (opNhanVien.isPresent()) {
			NhanVienCongTy orginal = opNhanVien.get();
			nhanvienctyRepository.delete(orginal);
			return ResponseEntity.ok(orginal);
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
