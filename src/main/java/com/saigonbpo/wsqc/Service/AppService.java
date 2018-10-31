package com.saigonbpo.wsqc.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;


public interface AppService {
	

	
	public List<Map<String,Object>> getEmployees();

	public boolean checkPresentUser(Map<String, Object> input);

	public boolean updateDataPre(Map<String, Object> input);

	public boolean insertQDE(Map<String, Object> input);

	public boolean checkPresentUserCRC(Map<String, Object> input);

	public boolean updateDataCRC(Map<String, Object> input);

	public boolean insertQDECRC(Map<String, Object> input);

	public List<Map<String, Object>> masterdata(Map<String, Object> input);

	public List<Map<String, Object>> AllocateView();

	public boolean UpdateAllocate(List<Map<String, Object>> input);

	public boolean insertAllocate(Map<String, Object> input);

}
