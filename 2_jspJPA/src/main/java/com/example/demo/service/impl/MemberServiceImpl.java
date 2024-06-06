package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.MemberService;
@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberRepository mr;

	@Override
	public void addMember(Member m) {
		mr.save(m);
		
	}

	@Override
	public List<Member> selectAll() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public Member selectMember(String username, String password) {
		
		return mr.findByUsernameAndPassword(username, password);
		
	}

	@Override
	public boolean queryUsername(String username) {
		Boolean x=false;
		if(mr.findByUsername(username)!=null)
		{
			x=true;
		}
		return x;
	}

	@Override
	public Member selectById(int id) {
		Optional<Member> o=mr.findById(id);
		Member m=null;
		if(o.isPresent())
		{
			m=o.get();
		}
		return m;
	}

	@Override
	public void updateMember(int id, String name, String password, String address, String phone) {
		Member m=selectById(id);
		m.setName(name);
		m.setPassword(password);
		m.setAdress(address);
		m.setPhone(phone);
		mr.save(m);
		
	}

	@Override
	public void deleteMember(int id) {
		mr.deleteById(id);
		
	}
	
	

}
