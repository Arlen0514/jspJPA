package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
/*
 * JpaRepository--->堤供CRUD+自動轉換成-->bean物件 
 */
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Member;

public interface MemberRepository extends JpaRepository<Member,Integer>{
	@Query(value="select * from member where username=?1 and password=?2",nativeQuery=true)
	Member findByUsernameAndPassword(String username,String password);
	@Query(value="select * from member where username=?",nativeQuery=true)
	Member findByUsername(String username);
	

	

}
