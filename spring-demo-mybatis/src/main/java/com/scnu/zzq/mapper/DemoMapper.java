package com.scnu.zzq.mapper;

import com.scnu.zzq.pojo.DemoC;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMapper {

    @Select("select id,name,content from t_c")
    List<DemoC> selectAll();
}
