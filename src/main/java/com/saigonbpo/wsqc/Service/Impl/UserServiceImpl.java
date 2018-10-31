package com.saigonbpo.wsqc.Service.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.saigonbpo.wsqc.Mapper.AppMapper;
import com.saigonbpo.wsqc.Mapper.LookupChannelMapper;
import com.saigonbpo.wsqc.Service.AppService;
import com.saigonbpo.wsqc.Service.UserFeService;

@Service
@Transactional
public class UserServiceImpl implements UserFeService {

	@Autowired
	LookupChannelMapper userMapper;
	
	@Override
	public Map<String, Object> findByUserName(String username) {
		// TODO Auto-generated method stub
		return userMapper.findByUserName(username);
	}

	


}
