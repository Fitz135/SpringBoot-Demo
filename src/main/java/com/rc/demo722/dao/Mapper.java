package com.rc.demo722.dao;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@org.apache.ibatis.annotations.Mapper
public abstract class Mapper {

    @Select("select name from demo722")
    public abstract List<Map<String,Object>> gainName();

    @Select("select ID from demo722")
    public abstract List<Map<String,Object>> gainID();

    @Delete("delete from demo722")
    public abstract int deleteMessage();

    @Update("update demo722 set grade=18  where grade=#{grade}")
    public abstract int updateMessage(@Param(value = "grade") String grade);

    @Insert("insert into demo722 (ID) values (#{id})")
    public abstract int insertMessage(Map<String, Object> map);

}
