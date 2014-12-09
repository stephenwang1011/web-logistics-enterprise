package com.incito.logistics.testcase.adduserinfo;

import org.testng.annotations.Test;

import com.incito.logistics.util.JdbcUtil;

/**
 * 
 * @author xy-incito-wk
 * @Description 清空数据库中该用户的全部个人信息
 *
 */
public class AddUserInfoPage_034_JdbcUpdateDeleteAddUseInfo_Test extends JdbcUtil {
	@Test
	public void jdbcUpdate() {
		String sql = "UPDATE smartdb.agent SET name = NULL, tel = NULL, icard = NULL, company = NULL, province = NULL, city = NULL, region = NULL, address = NULL, status = 1 WHERE  username = 'wangkai'";
		update(sql);
	}

}
