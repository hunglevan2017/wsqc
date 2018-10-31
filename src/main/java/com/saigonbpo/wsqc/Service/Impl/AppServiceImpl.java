package com.saigonbpo.wsqc.Service.Impl;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctc.wstx.util.StringUtil;
import com.saigonbpo.wsqc.Common.Constants;
import com.saigonbpo.wsqc.Mapper.AppMapper;
import com.saigonbpo.wsqc.Service.AppService;

@Service
@Transactional
public class AppServiceImpl implements AppService {

	@Autowired
	private AppMapper appMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Resource(name = "sqlSession_01")
	private SqlSession session_01;

	private AppMapper appMapper_db_CRC;

	@PostConstruct
	public void AppServiceImpl() {
		appMapper_db_CRC = session_01.getMapper(AppMapper.class);
	}

	@Override
	public List<Map<String, Object>> getEmployees() {
		// TODO Auto-generated method stub

		List<Map<String, Object>> Result = new ArrayList<>();

		Map<String, Object> temp = new HashMap<>();
		temp.put("ID", "E01");
		temp.put("Name", "Smith");
		temp.put("Role", "Clerk");

		Map<String, Object> temp1 = new HashMap<>();
		temp1.put("ID", "E02");
		temp1.put("Name", "Salesman");
		temp1.put("Role", "Salesman");

		Map<String, Object> temp2 = new HashMap<>();
		temp2.put("ID", "E03");
		temp2.put("Name", "Jones");
		temp2.put("Role", "Manager");

		Result.add(temp);
		Result.add(temp1);
		Result.add(temp2);

		return appMapper.selectAll();
	}

	@Override
	public boolean checkPresentUser(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.checkPresentUser(input);
	}

	public String propertyChange(Map<String, Object> input) {
		String data_change_str = "";
		Iterator it = input.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			String key = pair.getKey().toString();
			String Prefix = Constants.getPrefix(key);
			Prefix = " - " + Prefix;

			if (input.get(key + "_org") != null && input.get(key) != null
					&& !(input.get(key).equals(input.get(key + "_org"))) && !(input.get(key).equals(""))
					&& !key.equals("modified_fields")) {
				
				logger.info("Key:" +  input.get(key) );
				logger.info("Key:" +  input.get(key + "_org") );
				
				data_change_str += Prefix + "*bf*" + input.get(key + "_org") + "*at*"
						+ input.get(key) + "###";
			}

			// System.out.println(pair.getKey() + " = " + pair.getValue());
			// it.remove(); // avoids a ConcurrentModificationException
		}
		logger.info("data_change_str:" + data_change_str);
		return data_change_str;
	}

	@Override
	public boolean updateDataPre(Map<String, Object> input) {
		// TODO Auto-generated method stub
		try {
			logger.info(input.toString());
			// Update Information Customer to table Data
			appMapper.updateDataPre(input);
			logger.info("01. PASS updateDataPre");

			// Loop Map Object
			String data_change_str = propertyChange(input);

			// Insert table preapprove_data_change_log
			if (!data_change_str.equals("")) {
				input.put("data_change_str", data_change_str);
				input.put("id", 0);
				appMapper.insertPreapprove_data_change_log(input);
				if ((Integer) input.get("id") <= 0) {
					logger.error(input.toString());
					logger.error("Cannot insert Preapprove_data_change_log");
					return false;
				}

			}
			logger.info("02. PASS insert Preapprove_data_change_log");

			// Begin update status data in Management table
			appMapper.updateManagement03(input);

			if (input.get("is_data_change").equals("1"))
				appMapper.updateManagement04(input);
			
			logger.info("FINISHED updateDataPre");

			return true;
		} catch (Exception ex) {
			logger.info(ex.toString());
			return false;
		}

	}

	@Override
	public boolean insertQDE(Map<String, Object> input) {
		// TODO Auto-generated method stub
		try {
			appMapper.insertQDE(input);
			if ((int) input.get("id") > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
			return false;
		}

	}

	@Override
	public boolean checkPresentUserCRC(Map<String, Object> input) {
		// TODO Auto-generated method stub

		return appMapper_db_CRC.checkPresentUserCRC(input);
	}

	@Override
	public boolean updateDataCRC(Map<String, Object> input) {
		try {
			
			//Print Input
			logger.info(input.toString());
			
			// Update Information Customer to table Data
			appMapper_db_CRC.updateDataCRC(input);

			logger.info("01. PASS updateDataPre");

			// View Property Change
			String data_change_str = propertyChange(input);

			// Insert table preapprove_data_change_log
			if (!data_change_str.equals("")) {
				input.put("data_change_str", data_change_str);
				input.put("id", 0);
				appMapper_db_CRC.insertPreapprove_data_change_log_CRC(input);
				if ((Integer) input.get("id") <= 0) {
					logger.error(input.toString());
					logger.error("Cannot insert Preapprove_data_change_log");
					return false;
				}

			}
			
			logger.info("02. PASS insert Preapprove_data_change_log");

			// Begin update status data in Management table
			appMapper_db_CRC.updateManagement03CRC(input);

			if (input.get("is_data_change").equals("1"))
				appMapper_db_CRC.updateManagement04CRC(input);
			
			logger.info("FINISHED updateDataCRC");

			return true;
		} catch (Exception ex) {
			logger.info(ex.toString());
			return false;
		}
	}

	@Override
	public boolean insertQDECRC(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper_db_CRC.insertQDECRC(input);
	}

	@Override
	public List<Map<String, Object>> masterdata(Map<String, Object> input) {
		// TODO Auto-generated method stub
		return appMapper.masterdata(input);
	}

	@Override
	public List<Map<String, Object>> AllocateView() {
		// TODO Auto-generated method stub
		return appMapper.AllocateView();
	}

	@Override
	public boolean UpdateAllocate(List<Map<String, Object>> input) {
		// TODO Auto-generated method stub
		try {
			 appMapper.UpdateAllocate(input);
			 return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean insertAllocate(Map<String, Object> input) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try {
			 appMapper.insertAllocate(input);
			 return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

}
