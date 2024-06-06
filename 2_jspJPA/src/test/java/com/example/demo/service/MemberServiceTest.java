package com.example.demo.service;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.service.impl.MemberServiceImpl;

@SpringBootTest
public class MemberServiceTest {
	@Autowired
	MemberServiceImpl msi;
	@Autowired
	MemberRepository mr;
	//@Test
	public void addMemberTest()
	{
		Member m=new Member("m004","Chanel","jhi4653","85485","台南","097846987");
		msi.addMember(m);
		System.out.println("建檔測試成功");
		
	}
	//@Test
	public void selectByIdTest()
	{
		Member m=msi.selectById(2);
		System.out.println("調閱成功-->"+m.getName());
	}
	//@Test 
	public void updateMemberTest()
	{
		msi.updateMember(5, "Joker", "asw6548", "新北", "097745869");
		System.out.println("更新成功");
	}
	//@Test
	public void selectMemberTest()
	{
		System.out.println(msi.selectMember("asdzxc123", "12346548"));
	}
	@Test
	public void usernameBoTest()
	{
		System.out.println(msi.queryUsername("asdzxc123"));
	}

}
