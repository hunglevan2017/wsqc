package com.saigonbpo.wsqc.Controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.saigonbpo.wsqc.Mapper.LookupChannelMapper;
import com.saigonbpo.wsqc.Model.LookupChannel;
import com.saigonbpo.wsqc.Service.AppService;


import ch.qos.logback.classic.pattern.Util;

@RestController
@RequestMapping("/user")
public class UserCtrl {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	LookupChannelMapper userMapper;

	
	
	// Insert
	@RequestMapping(value = "", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	public ResponseEntity<Integer> insertSelective(@RequestBody LookupChannel record) {
		int resultCount = userMapper.insertSelective(record);
		return new ResponseEntity<Integer>(resultCount, HttpStatus.OK);
	}

	// Update
	@RequestMapping(value = "/{LookupChannelId}", method = RequestMethod.PUT, produces = {
			"application/json;charset=UTF-8" })
	public ResponseEntity<Integer> updateByPrimaryKeySelective(@RequestBody LookupChannel record) {
		int resultCount = userMapper.updateByPrimaryKeySelective(record);
		return new ResponseEntity<Integer>(resultCount, HttpStatus.OK);
	}
	
	// Select
	@RequestMapping(value = "/{LookupChannelId}", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	public ResponseEntity<LookupChannel> selectByPrimaryKey(@PathVariable("LookupChannelId") int LookupChannelId){
		LookupChannel LookupChannel = userMapper.selectByPrimaryKey(LookupChannelId);
		return new ResponseEntity<LookupChannel>(LookupChannel, HttpStatus.OK);
	}
	
	
	

}
