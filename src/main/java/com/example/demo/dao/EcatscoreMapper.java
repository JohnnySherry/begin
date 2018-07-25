package com.example.demo.dao;

import com.example.demo.entity.Ecatscore;
import com.example.demo.entity.EcatscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcatscoreMapper {
    int countByExample(EcatscoreExample example);

    int deleteByExample(EcatscoreExample example);

    int deleteByPrimaryKey(Integer scoreid);

    int insert(Ecatscore record);

    int insertSelective(Ecatscore record);

    List<Ecatscore> selectByExample(EcatscoreExample example);

    Ecatscore selectByPrimaryKey(Integer scoreid);

    int updateByExampleSelective(@Param("record") Ecatscore record, @Param("example") EcatscoreExample example);

    int updateByExample(@Param("record") Ecatscore record, @Param("example") EcatscoreExample example);

    int updateByPrimaryKeySelective(Ecatscore record);

    int updateByPrimaryKey(Ecatscore record);
}