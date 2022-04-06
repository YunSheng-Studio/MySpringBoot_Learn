package com.yunsheng.springbootmybatis;

import com.yunsheng.springbootmybatis.domain.Student;
import com.yunsheng.springbootmybatis.mapper.StudentMapper;
import com.yunsheng.springbootmybatis.mapper.StudentXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private StudentMapper studentmapper;
	@Autowired
	private StudentXmlMapper studentxmlmapper;

	@Test
	public void textFindAll_1() {
		List<Student> list=studentmapper.FindAll();
		System.out.println(list);
	}

	@Test
	public void textFindAll_2() {
		List<Student> list=studentxmlmapper.FindAll();
		System.out.println(list);
	}
}
