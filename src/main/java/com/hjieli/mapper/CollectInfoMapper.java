package com.hjieli.mapper;

import com.hjieli.entity.CollectInfo;
import com.hjieli.entity.CollectInfoWithBLOBs;

public interface CollectInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CollectInfoWithBLOBs record);

    int insertSelective(CollectInfoWithBLOBs record);

    CollectInfoWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CollectInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CollectInfoWithBLOBs record);

    int updateByPrimaryKey(CollectInfo record);
}