package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {
	@Autowired
	MemberRepository mr;
	//@Test
	public void addTest()
	{
		mr.save(new Member("m002","Peter","ajhbf6548","9152673","台南","0938938438"));
		System.out.println("建檔成功");
	}
	
	

}
