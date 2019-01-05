package com.hjieli.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hjieli.entity.CollectInfo;
import com.hjieli.entity.CollectInfoWithBLOBs;
import com.hjieli.mapper.CollectInfoMapper;

@Service("collectService")
public class CollectService implements CollectInfoMapper{

	@Resource
	private CollectInfoMapper collectInfoMapper;
	
	
	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return collectInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CollectInfoWithBLOBs record) {
		// TODO Auto-generated method stub
		return collectInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(CollectInfoWithBLOBs record) {
		// TODO Auto-generated method stub
		return collectInfoMapper.insertSelective(record);
	}

	@Override
	public CollectInfoWithBLOBs selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return collectInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CollectInfoWithBLOBs record) {
		// TODO Auto-generated method stub
		return collectInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(CollectInfoWithBLOBs record) {
		// TODO Auto-generated method stub
		return collectInfoMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(CollectInfo record) {
		// TODO Auto-generated method stub
		return collectInfoMapper.updateByPrimaryKey(record);
	}

}
