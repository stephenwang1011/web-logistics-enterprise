package com.incito.logistics.testcase.findgoods;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.base.BaseParpare;
import com.incito.logistics.pages.HomePage;
import com.incito.logistics.pages.pageshelper.FindGoodsPageHelper;
import com.incito.logistics.pages.pageshelper.HomePageHelper;
import com.incito.logistics.pages.pageshelper.LoginPageHelper;
import com.incito.logistics.util.PropertiesDataProvider;

/**
 * @author xy-incito-wy
 * @Description 找货源-公共货源上，按车长排序货源
 * */
public class FindGoodsPagePublicGoods_018_CarLengthSort_Test extends BaseParpare {
	@Test
	public void publicCarLengthSort(ITestContext context) {
		String configFilePath = String.valueOf(context.getCurrentXmlTest().getParameter("userInfoPath"));
		int timeOut = Integer.valueOf(context.getCurrentXmlTest().getParameter("timeOut"));
		int sleepTime = Integer.valueOf(context.getCurrentXmlTest().getParameter("sleepTime"));
		String username = PropertiesDataProvider.getTestData(configFilePath, "username");
		String password = PropertiesDataProvider.getTestData(configFilePath, "password");

		HomePageHelper.waitHomePageToLoad(timeOut, seleniumUtil);
		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_BUTTON_LOGIN);
		LoginPageHelper.waitLoginPageToLoad(timeOut, seleniumUtil);
		LoginPageHelper.login(seleniumUtil, username, password);
		LoginPageHelper.checkUserInfo(timeOut, sleepTime, seleniumUtil, username);
		HomePageHelper.enterPage(seleniumUtil, HomePage.HP_LINK_FINDGOODS);
		FindGoodsPageHelper.waitFindGoodsPageToLoad(timeOut, seleniumUtil);
		FindGoodsPageHelper.checkCarsSort(seleniumUtil, "车长", timeOut);
	}
}
