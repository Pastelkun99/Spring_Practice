package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	//@Select("SELECT sysdate FROM dual")
	//@Select("SELECT dbms_xdb.gethttpport() FROM dual")
	//@Select("SELECT gaps FROM temp_tbl")
	
	public String getTime();
	
	public String getTime2();
	
	public String getValues();
	
}
