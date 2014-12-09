package com.incito.logistics.testcase.home;


import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.base.BaseParpare;
import com.incito.logistics.pages.pageshelper.HomePageHelper;
/**
 *@author  xy-incito-wy
 *@Description 测试用例：未登录情况下检查车源的驾驶证信息 ：会有*显示
 *
 * */
public class HomePage_015_NotLoginCheckLicense_Test extends BaseParpare {
	@Test
	public void notLoginCheckLicense(ITestContext context) {
		int timeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("timeOut"));
		
		HomePageHelper.waitHomePageToLoad(timeOut, seleniumUtil);
		HomePageHelper.checkLicenseInNotLoginStatus(seleniumUtil);

	}

}
