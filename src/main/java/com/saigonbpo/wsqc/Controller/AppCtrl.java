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

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.saigonbpo.wsqc.Common.ProjectUtil;
import com.saigonbpo.wsqc.Service.AppService;
import com.saigonbpo.wsqc.Service.UserFeService;

import ch.qos.logback.classic.pattern.Util;

@RestController
@RequestMapping("/app")
public class AppCtrl {

	@Autowired
	private AppService appService;

	@Autowired
	private UserFeService userFeService;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("")
	@ResponseBody
	public String index() throws NoSuchAlgorithmException {
		
		//String result = ProjectUtil.getMD5Hex("Saigonbpo@123");
		//logger.info("Aok");
		
		/*
		UserFe userFe = new UserFe();
		
		if(userFeMapper==null)
			System.out.println("null value");
		
		userFe.setUserName("Lê Văn Hỏi Ngã dấu chấm cộng");
		System.out.println( userFeMapper.insertSelective(userFe) );
		System.out.println(userFe.toString());
		

		userFe = userFeService.selectByPrimaryKey((long)67);
		System.out.println(""+userFe.getUserName());
		*/
		return "Web Service QC Tool" ;
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Map<String, Object>> getEmployees() {
		return appService.getEmployees();
	}
	
	
	

}
