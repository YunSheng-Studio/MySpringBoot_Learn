package com.yunsheng.springbootmybatis.mapper;

import com.yunsheng.springbootmybatis.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentXmlMapper {
    public List<Student> FindAll();
}
