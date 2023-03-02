package com.example.icms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.icms.model.Bluesd;

@Repository
public interface BluesdRepository extends JpaRepository<Bluesd, Integer> {
	
	 @Query(value = "select * from BLU_SD s where s.SD_REG_NO like %:keyword% or s.REGISTRATION_ID like %:keyword%", nativeQuery = true)
	 List<Bluesd> findByKeyword(@Param("keyword") String keyword);


}
