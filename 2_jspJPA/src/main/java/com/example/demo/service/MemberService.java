package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;

public interface MemberService {
	//create
	void addMember(Member m);
	
	//read
	List<Member> selectAll();
	Member selectMember(String username,String password);
	boolean queryUsername(String username);
	Member selectById(int id);
	
	//update
	void updateMember(int id,String name,String password,String address,String phone);
	
	//delete
	void deleteMember(int id);

}
