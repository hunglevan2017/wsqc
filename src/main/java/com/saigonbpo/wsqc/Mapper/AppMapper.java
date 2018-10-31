package com.saigonbpo.wsqc.Mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AppMapper {

	List<Map<String, Object>> selectAll();

	boolean checkPresentUser(Map<String, Object> input);

	void updateDataPre(Map<String, Object> input);

	void insertPreapprove_data_change_log(Map<String, Object> input);

	void updateManagement03(Map<String, Object> input);

	void updateManagement04(Map<String, Object> input);

	boolean insertQDE(Map<String, Object> input);

	boolean checkPresentUserCRC(Map<String, Object> input);

	void updateDataCRC(Map<String, Object> input);

	void updateManagement03CRC(Map<String, Object> input);

	void updateManagement04CRC(Map<String, Object> input);

	void insertPreapprove_data_change_log_CRC(Map<String, Object> input);

	boolean insertQDECRC(Map<String, Object> input);

	List<Map<String, Object>> masterdata(Map<String, Object> input);

	List<Map<String, Object>> AllocateView();

	void UpdateAllocate(@Param("allocate_list")  List<Map<String, Object>> input);

	void insertAllocate(Map<String, Object> input);

}
