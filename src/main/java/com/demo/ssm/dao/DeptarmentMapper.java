package com.demo.ssm.dao;

import com.demo.ssm.bean.Deptarment;
import com.demo.ssm.bean.DeptarmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptarmentMapper {
    long countByExample(DeptarmentExample example);

    int deleteByExample(DeptarmentExample example);

    int deleteByPrimaryKey(Integer deptId);

    int insert(Deptarment record);

    int insertSelective(Deptarment record);

    List<Deptarment> selectByExample(DeptarmentExample example);

    Deptarment selectByPrimaryKey(Integer deptId);

    int updateByExampleSelective(@Param("record") Deptarment record, @Param("example") DeptarmentExample example);

    int updateByExample(@Param("record") Deptarment record, @Param("example") DeptarmentExample example);

    int updateByPrimaryKeySelective(Deptarment record);

    int updateByPrimaryKey(Deptarment record);
}