package com.saigonbpo.wsqc.Mapper;

import com.saigonbpo.wsqc.Model.LookupChannel;
import com.saigonbpo.wsqc.Model.LookupChannelExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface LookupChannelMapper {
    long countByExample(LookupChannelExample example);

    int deleteByExample(LookupChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LookupChannel record);

    int insertSelective(LookupChannel record);

    List<LookupChannel> selectByExample(LookupChannelExample example);

    LookupChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LookupChannel record, @Param("example") LookupChannelExample example);

    int updateByExample(@Param("record") LookupChannel record, @Param("example") LookupChannelExample example);

    int updateByPrimaryKeySelective(LookupChannel record);

    int updateByPrimaryKey(LookupChannel record);

	Map<String, Object> findByUserName(String username);
}