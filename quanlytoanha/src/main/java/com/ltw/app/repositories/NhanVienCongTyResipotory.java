package com.ltw.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltw.app.entities.NhanVienCongTy;


@Repository
public interface NhanVienCongTyResipotory extends JpaRepository<NhanVienCongTy, Integer>{

}
